package com.john.pattern.strategy.dispatch;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DispatcherServlet extends HttpServlet {

    private static final long serialVersionUID = -4125494211670940600L;

    private static List<DispatcherMapper> mappers = new ArrayList<>();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        try {
            String uri = req.getRequestURI();
            DispatcherMapper mapper = mappers.stream().filter(m -> StringUtils.equals(uri, m.getUri())).findFirst().orElse(null);
            if(mapper == null){
                resp.getWriter().write("404 not found");
            } else {
                Class clazz = mapper.getClazz();
                Method method = mapper.getMethod();
                String uid = req.getParameter("uid");
                Object result = method.invoke(clazz.newInstance(), uid);
                resp.getWriter().write("200 " + result);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void init() {
        try {
            Class<UserController> clazz = UserController.class;
            DispatcherMapper mapper = new DispatcherMapper(clazz, clazz.getMethod("queryUser", String.class), "/getUserById");
            mappers.add(mapper);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private static class DispatcherMapper {

        private Class clazz;

        private Method method;

        private String uri;

        public DispatcherMapper(Class clazz, Method method, String uri) {
            this.clazz = clazz;
            this.method = method;
            this.uri = uri;
        }

        public Class getClazz() {
            return clazz;
        }

        public void setClazz(Class clazz) {
            this.clazz = clazz;
        }

        public Method getMethod() {
            return method;
        }

        public void setMethod(Method method) {
            this.method = method;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }
    }
}
