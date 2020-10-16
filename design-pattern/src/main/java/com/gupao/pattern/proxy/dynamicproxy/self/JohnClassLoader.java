package com.gupao.pattern.proxy.dynamicproxy.self;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class JohnClassLoader extends ClassLoader {

    private File classpathFile;

    public JohnClassLoader(){
        String classpath = JohnClassLoader.class.getResource("").getPath();
        this.classpathFile = new File(classpath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {

        String className = JohnClassLoader.class.getPackage().getName() + "." + name;
        if(classpathFile != null){
            File  classFile = new File(classpathFile, name.replaceAll("\\.", "/") + ".class");
            if(classFile.exists()){

                try (FileInputStream in = new FileInputStream(classFile);
                     ByteArrayOutputStream out = new ByteArrayOutputStream();){

                    byte[] buffer = new byte[1024];
                    int len;
                    while ((len =  in.read(buffer)) != -1) {
                        out.write(buffer, 0, len);
                    }

                    return defineClass(className, out.toByteArray(), 0, out.size());

                } catch (Exception e) {
                    e.printStackTrace();
                }


            }
        }

        return super.findClass(name);
    }
}
