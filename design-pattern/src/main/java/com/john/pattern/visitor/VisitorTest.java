package com.john.pattern.visitor;

public class VisitorTest {

    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.attach(new Man("zhangsan"));
        os.attach(new Man("lisi"));
        os.attach(new Woman("Lily"));

        os.display(new Fail());
    }
}
