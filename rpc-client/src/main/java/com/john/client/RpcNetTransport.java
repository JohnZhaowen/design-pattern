package com.john.client;

import com.john.rpc.RpcRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

@Data
@AllArgsConstructor
public class RpcNetTransport {

    private String host;

    private int port;

    public Object send(RpcRequest rpcRequest){

        try (
            Socket socket = new Socket(host, port);
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

        ){
            out.writeObject(rpcRequest);
            out.flush();
            return in.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
