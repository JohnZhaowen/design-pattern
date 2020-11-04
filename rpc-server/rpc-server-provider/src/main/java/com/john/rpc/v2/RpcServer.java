package com.john.rpc.v2;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class RpcServer implements ApplicationContextAware, InitializingBean {

    private ExecutorService executorService = Executors.newCachedThreadPool();

    private Map<String, Object> handlerMap = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            Socket socket = serverSocket.accept();
            executorService.submit(new ProcessorHandler(socket, handlerMap));

        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, Object> services =
                applicationContext.getBeansWithAnnotation(RpcService.class);

        services.forEach((k, v) -> {
            RpcService annotation = v.getClass().getAnnotation(RpcService.class);
            String serviceName = annotation.value().getName();
            handlerMap.put(serviceName, v);

        });

    }
}
