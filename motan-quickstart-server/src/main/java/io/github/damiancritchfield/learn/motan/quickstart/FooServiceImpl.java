package io.github.damiancritchfield.learn.motan.quickstart;

public class FooServiceImpl implements FooService{
    @Override
    public String hello(String name) {

        System.out.println(name + " invoked rpc service start");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " invoked rpc service end");
        return "hello " + name;
    }
}
