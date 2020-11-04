package com.john.distribution.serializable;

import java.io.*;

public class JdkSerializer implements ISerializer {

    @Override
    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream out = null;
        try {
            out = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return out.toByteArray();
    }

    @Override
    public <T> T deserializa(byte[] data, Class<T> clazz) {

        try {
            ByteArrayInputStream in = new ByteArrayInputStream(data);

            ObjectInputStream ois = new ObjectInputStream(in);
            return (T)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;

    }
}
