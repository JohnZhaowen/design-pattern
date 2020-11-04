package com.john.distribution.serializable;

public class SerializableTest {

    public static void main(String[] args) {

//        ISerializer serializer = new FastJsonSerializer(); //长度28
//        ISerializer serializer = new JdkSerializer(); //长度109
//        ISerializer serializer = new XStreamSerializer(); //长度124
        ISerializer serializer = new HessianSerializer(); //长度73

        byte[] userBytes = serializer.serialize(new User("zhangsan", 15));
        System.out.println("序列化长度：" + userBytes.length);
        System.out.println("序列化对象：\n" + new String(userBytes));

        User deUser = serializer.deserializa(userBytes, User.class);
        System.out.println("序列化后的User: " + deUser);

    }
}
