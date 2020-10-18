package com.john.pattern.proxy.dynamicproxy.jdk;

import com.john.pattern.proxy.staticproxy.findlove.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

public class JdkProxyTest {

    public static void main(String[] args) throws Exception {

        Person person = (Person)new Meipo().getInstance(new Girl());
        person.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("D://$Proxy0.class");
        os.write(bytes);
        os.close();
        System.out.println("文件输出成功");

    }
}
