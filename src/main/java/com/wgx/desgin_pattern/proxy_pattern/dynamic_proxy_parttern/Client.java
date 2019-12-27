package com.wgx.desgin_pattern.proxy_pattern.dynamic_proxy_parttern;

/**
 * 想要租房的人
 */
public class Client {

    public static void main(String[] args) {
        // 真实的类，即是需要出租房子的房东
        Host host = new Host();
        InvocationHandleImpl invocationHandle = new InvocationHandleImpl();
        invocationHandle.setRent(host);
        // 通过代理处理程序来获取一个代理类
        Rent proxy = (Rent) invocationHandle.getProxy();
        proxy.rent();
    }
}
