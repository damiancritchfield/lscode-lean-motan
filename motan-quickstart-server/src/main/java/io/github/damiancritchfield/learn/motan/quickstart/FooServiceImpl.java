package io.github.damiancritchfield.learn.motan.quickstart;

public class FooServiceImpl implements FooService{
    @Override
    public String hello(String name) {
        System.out.println(name + " invoked rpc service");
        return "hello " + name;
    }
}
