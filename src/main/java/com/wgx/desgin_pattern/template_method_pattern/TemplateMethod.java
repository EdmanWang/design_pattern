package com.wgx.desgin_pattern.template_method_pattern;

/**
 * 抽象初一个方法出去，这个方法又用户决定怎么去实现。
 */
public abstract class TemplateMethod {

    public void method() {

    }

    protected void testMethod() {
        System.out.println("模版方法前需要做的事情");
        System.out.println("----------------------");
        method();
        System.out.println("++++++++++++++++++++++");
        System.out.println("模版方法后需要做的事情");
    }
}
