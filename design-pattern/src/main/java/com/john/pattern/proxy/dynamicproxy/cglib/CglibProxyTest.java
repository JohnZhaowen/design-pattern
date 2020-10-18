package com.john.pattern.proxy.dynamicproxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibProxyTest {

    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "d://cglib");
        Meinv meinvProxy = (Meinv)new CglibMeipo().getInstance(Meinv.class);
        meinvProxy.findLove();
    }
}
