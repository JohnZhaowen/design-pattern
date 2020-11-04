package com.john.client;

import com.john.rpc.IHelloService;
import com.john.rpc.User;

/**
 * Hello world!
 *
 */
public class ClientApp {
    public static void main( String[] args ) {

        IHelloService service = new RpcProxyClient().clientProxy(IHelloService.class, "localhost", 8080);
        String result1 = service.hello("MIC");
        String result2 = service.saveUser(new User("hello", 12));
        System.out.println(result1);
        System.out.println(result2);
    }
}
