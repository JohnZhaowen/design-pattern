package com.john.rpc.v2;

import com.john.rpc.RpcRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Map;

@Data
@AllArgsConstructor
public class ProcessorHandler implements Runnable {

    private Socket socket;

    private Map<String, Object> handlerMap;

    @Override
    public void run() {
        try (
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        ){
            RpcRequest request = (RpcRequest) inputStream.readObject();
            Object result = invoke(request);

            outputStream.writeObject(result);
            outputStream.flush();

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private Object invoke(RpcRequest rpcRequest){

        Object service = handlerMap.get(rpcRequest.getClassName());
        if(service == null){
            throw new RuntimeException("404 service not found: " + rpcRequest.getClassName());
        }

        try {
            Object[] params = rpcRequest.getParams();
            Class<?>[] types = new Class[params.length];
            for(int i = 0; i < types.length; i++){
                types[i] = params[i].getClass();
            }

            Class<?> aClass = Class.forName(rpcRequest.getClassName());
            Method method = aClass.getMethod(rpcRequest.getMethodName(), types);

            return method.invoke(service, params);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
