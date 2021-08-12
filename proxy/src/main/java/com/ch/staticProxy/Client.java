package com.ch.staticProxy;

/**
 * 静态代理模式
 * @author CH
 * @date 2021-08-12 9:36
 */
public class Client {
    public static void main(String[] args) {
        SellTickets proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
