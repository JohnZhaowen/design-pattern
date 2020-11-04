package com.john.rpc.v2;

import com.john.rpc.IHelloService;
import com.john.rpc.User;

@RpcService(IHelloService.class)
public class HelloService implements IHelloService {
    @Override
    public String hello(String content) {
        System.out.println("request in " + content);
        return "Hello " + content;
    }

    @Override
    public String saveUser(User user) {
        System.out.println("request in " + user);
        return "Success";
    }
}
