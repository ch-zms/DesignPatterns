package com.ch.cglibProxy;


/**
 * cglib代理模式
 * @author CH
 * @date 2021-08-12 9:36
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.getProxyObject().sell();
    }
}
