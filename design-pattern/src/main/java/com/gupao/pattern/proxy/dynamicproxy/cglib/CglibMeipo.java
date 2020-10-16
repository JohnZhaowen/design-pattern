package com.gupao.pattern.proxy.dynamicproxy.cglib;

import com.gupao.pattern.proxy.staticproxy.dbroute.Order;
import com.gupao.pattern.proxy.staticproxy.dbroute.db.DynamicDataSourceEntity;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class clazz){
        //类似于jdk中的Proxy，都是用于生成一个新的class文件，并加载到VM
        Enhancer enhancer = new Enhancer();
        //由于cglib是基于继承实现的动态代理，这里设置需要代理的类
        enhancer.setSuperclass(clazz);
        //设置回调，即实现了MethodInterceptor的类，会回调该类的intercept方法
        enhancer.setCallback(this);
        //返回代理对象
        return enhancer.create();
    }

    /**
     * 增强在这里实现
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    private void after() {
        System.out.println("---媒婆寻找对象---");
    }

    private void before() {
        System.out.println("---媒婆处理后续事项---");
    }

}
