package com.wgx.desgin_pattern.template_method_pattern;

public class TemplateMethodTest extends TemplateMethod {

    @Override
    public void method() {
        System.out.println("我是具体需要执行的方法");
        try {
            Thread.sleep(8_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TemplateMethodTest templateMethodTest = new TemplateMethodTest();
        templateMethodTest.testMethod();
    }
}
