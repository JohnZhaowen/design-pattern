package com.john.client;

import com.john.rpc.RpcRequest;
import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

@AllArgsConstructor
public class RemoteInvocationHandler implements InvocationHandler {

    private int port;

    private String host;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("come in");

        RpcRequest rpcRequest = new RpcRequest(
                method.getDeclaringClass().getName(),
                method.getName(),
                args
                );

        return new RpcNetTransport(host, port).send(rpcRequest);
    }
}
