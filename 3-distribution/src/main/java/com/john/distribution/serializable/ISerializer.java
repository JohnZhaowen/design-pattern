package com.john.distribution.serializable;

public interface ISerializer {

    <T> byte[] serialize(T obj);

    <T> T deserializa(byte[] data, Class<T> clazz);
}
