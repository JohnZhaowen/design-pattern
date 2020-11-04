package com.john.client;

import java.lang.reflect.Proxy;

public class RpcProxyClient {

    public <T> T clientProxy(Class<T> clazz, String host, int port) {
        return (T)Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new RemoteInvocationHandler(port, host));
    }
}
