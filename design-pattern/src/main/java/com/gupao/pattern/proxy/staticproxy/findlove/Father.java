package com.gupao.pattern.proxy.staticproxy.findlove;

public class Father {

    private Person person;

    public void findLove(){
        System.out.println("父亲为儿子物色对象");
        person.findLove();
        System.out.println("双方父母同意，确定关系");
    }

    public Father(Person person) {
        this.person = person;
    }
}
