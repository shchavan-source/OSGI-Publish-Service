package org.fusesource.example;

public class HelloWorldImpl implements HelloWorldService{
    @Override
    public void printHelloWorld() {
        System.out.println("Hello OSGI world");
    }
}
