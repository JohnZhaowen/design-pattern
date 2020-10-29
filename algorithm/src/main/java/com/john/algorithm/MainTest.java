package com.john.algorithm;

import java.io.File;

public class MainTest {

    public static void main(String[] args) {
        File file = new File("D:\\Java\\专题类\\尚硅谷Java数据结构和算法\\视频");
        File[] files = file.listFiles();

        for(File f : files){

            String name = f.getName();
            String rex = "尚硅谷-老韩图解Java数据结构和算法-";
            if(name.contains(rex)){
                name = name.replace(rex, "");
                f.renameTo(new File(name));
            }


        }
    }
}
