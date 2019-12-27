package com.wgx.desgin_pattern.proxy_pattern.static_proxy_parttern;

/**
 * 房屋中介
 */
public class HouseProxy implements Rent {

    private Host host;

    public void setHost(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        seeHouse();
        host.rent();
        needMoney();
    }

    public void seeHouse() {
        System.out.println("中介带你看房子");
    }

    public void needMoney() {
        System.out.println("中介收取中介费");
    }
}
