package com.gupao.pattern.proxy.dynamicproxy.self;
import com.gupao.pattern.proxy.staticproxy.findlove.Person;
import java.lang.reflect.*;
public final class $Proxy0 extends JohnProxy implements Person {
JohnInvocationHandler h;
public $Proxy0(JohnInvocationHandler h) {
this.h = h;
}
public void findLove() {
try {
Method m = Person.class.getMethod("findLove", new Class[]{});
this.h.invoke(this, m, null);
} catch(Exception e){ } catch (Throwable throwable){}
}
}
