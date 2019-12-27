package com.wgx.desgin_pattern.proxy_pattern.dynamic_proxy_parttern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 使用jdk中自带的代理模式
 */
public class InvocationHandleImpl implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    /**
     * @param target 需要代理的类
     * @param method 代理类中需要执行的方法
     * @param args   执行方法中的参数列表
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object target, Method method, Object[] args) throws Throwable {
        seeHouse();
        Object invoke = method.invoke(rent, args);
        needMoney();
        return invoke;
    }

    public void seeHouse() {
        System.out.println("中介带你看房");
    }

    public void needMoney() {
        System.out.println("中介收取中介费");
    }
}
