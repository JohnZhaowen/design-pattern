package com.john.pattern.template.course;

public abstract class NetworkCourse {

    protected final void createCourse(){

        //1. 发布预习资料
        this.postPreResource();

        //2. 制作PPT
        this.createPPT();

        //3. 在线直播
        this.liveVideo();

        //4. 提交上课比较
        this.postNote();

        //5. 提交源码
        this.postSource();

        //6. 布置作业，有或者没有，有作业还需要检查作业
        if(needHomeWork()){
            checkHomeWork();
        }

    }

    abstract void checkHomeWork();

    protected boolean needHomeWork() {
        return false;
    }

    final void postSource(){
        System.out.println("提交上课源码");
    }


    final void postNote(){
        System.out.println("提交上课笔记");
    }

    final void liveVideo(){
        System.out.println("在线直播");
    }

    final void createPPT(){
        System.out.println("创建PPT");
    }

    final void postPreResource(){
        System.out.println("分发预习资料");
    }
}
