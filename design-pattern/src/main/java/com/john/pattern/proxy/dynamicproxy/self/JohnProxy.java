package com.john.pattern.proxy.dynamicproxy.self;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class JohnProxy {

    private static final String ln = "\r\n";

    public static Object newProxyInstance(JohnClassLoader loader,
                                          Class<?>[] interfaces,
                                          JohnInvocationHandler h)
            throws IllegalArgumentException {

        try {
            String src = generateSrc(interfaces);
            String path = JohnProxy.class.getResource("").getPath();
            File f = new File(path + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable iterable = manager.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();

            Class proxyClass = loader.findClass("$Proxy0");
            Constructor constructor = proxyClass.getConstructor(JohnInvocationHandler.class);
            return constructor.newInstance(h);

        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces) {

        StringBuffer sb = new StringBuffer();
        sb.append("package com.gupao.pattern.proxy.dynamicproxy.self;" + ln);
        sb.append("import com.gupao.pattern.proxy.staticproxy.findlove.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public final class $Proxy0 extends JohnProxy implements " + interfaces[0].getSimpleName() + " {" + ln);
        sb.append("JohnInvocationHandler h;" + ln);
        sb.append("public $Proxy0(JohnInvocationHandler h) {" + ln);
        sb.append("this.h = h;" + ln);
        sb.append("}" + ln);

        for(Method m : interfaces[0].getMethods()){
            sb.append("public " + m.getReturnType().getName() + " " + m.getName() + "() {" + ln);
            sb.append("try {" + ln);
            sb.append("Method m = " + interfaces[0].getSimpleName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            sb.append("this.h.invoke(this, m, null);" + ln);

            sb.append("} catch(Exception e){ } catch (Throwable throwable){}" + ln);


            sb.append("}" + ln);
        }


        sb.append("}" + ln);


        return sb.toString();
    }
}
