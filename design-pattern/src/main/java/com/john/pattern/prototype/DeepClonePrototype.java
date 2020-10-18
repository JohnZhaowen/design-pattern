package com.john.pattern.prototype;

import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.util.List;

/**
 * 深拷贝
 */
public class DeepClonePrototype implements Cloneable, Serializable {

    private static final long serialVersionUID = -20488232133883344L;

    private int age;

    private String name;

    private List<String> hobbies;

    private WorkExpience workExpience;

    @Override
    protected DeepClonePrototype clone() {

//        return deepCloneBySerializable();
        return deepCloneByJson();
    }

    private DeepClonePrototype deepCloneByJson(){
        String srcJson = JSONObject.toJSONString(this);
        return JSONObject.parseObject(srcJson, DeepClonePrototype.class);
    }

    private DeepClonePrototype deepCloneBySerializable() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (DeepClonePrototype)ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public WorkExpience getWorkExpience() {
        return workExpience;
    }

    public void setWorkExpience(WorkExpience workExpience) {
        this.workExpience = workExpience;
    }
}
