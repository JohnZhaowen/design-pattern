package com.john.pattern.singleton.lazy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 反序列化攻击
 */
public class SerializableAttackTest {

    public static void main(String[] args) {

        LazySingleton s1 = null;
        LazySingleton s2 = LazySingleton.getInstance();

        try(FileOutputStream fos = new FileOutputStream("Singletion.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            FileInputStream fis = new FileInputStream("Singletion.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
        ){

            oos.writeObject(s2);
            oos.flush();

            //关键在这里
            s1 = (LazySingleton)ois.readObject();


        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(s1 == s2);

    }
}
