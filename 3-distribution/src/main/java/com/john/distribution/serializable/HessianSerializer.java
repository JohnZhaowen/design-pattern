package com.john.distribution.serializable;

import com.alibaba.fastjson.JSON;
import com.caucho.hessian.io.HessianInput;
import com.caucho.hessian.io.HessianOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class HessianSerializer implements ISerializer {

    @Override
    public <T> byte[] serialize(T obj) {
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            HessianOutput hessianOutput = new HessianOutput(out);

            hessianOutput.writeObject(obj);

            return out.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public <T> T deserializa(byte[] data, Class<T> clazz) {
        try {
            ByteArrayInputStream in = new ByteArrayInputStream(data);
            HessianInput hessianInput = new HessianInput(in);
            return (T)hessianInput.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
