package com.john.distribution.serializable;

import com.alibaba.fastjson.JSON;

public class FastJsonSerializer implements ISerializer {

    @Override
    public <T> byte[] serialize(T obj) {
        return JSON.toJSONString(obj).getBytes();
    }

    @Override
    public <T> T deserializa(byte[] data, Class<T> clazz) {
        return JSON.parseObject(data, clazz);
    }
}
