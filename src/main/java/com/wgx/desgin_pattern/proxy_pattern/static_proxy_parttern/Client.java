package com.wgx.desgin_pattern.proxy_pattern.static_proxy_parttern;

/**
 * 想要租房的人
 */
public class Client {

    public static void main(String[] args) {
        HouseProxy houseProxy = new HouseProxy();
        houseProxy.setHost(new Host());
        houseProxy.rent();
    }
}
