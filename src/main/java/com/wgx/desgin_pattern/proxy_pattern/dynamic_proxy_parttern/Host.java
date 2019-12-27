package com.wgx.desgin_pattern.proxy_pattern.dynamic_proxy_parttern;


/**
 * 动态代理实现
 * 这是房东：需要出租房子
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东在出租房子");
    }
}
