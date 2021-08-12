package com.ch.cglibProxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author CH
 * @date 2021-08-12 10:07
 */
public class ProxyFactory implements MethodInterceptor {

    private final TrainStation target = new TrainStation();

    public TrainStation getProxyObject() {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback((Callback) this);
        //创建代理对象
        return (TrainStation) enhancer.create();
    }

    /**
     * @param o 代理对象
     * @param method 真实对象中的方法的Method实例
     * @param args 实际参数
     * @param methodProxy 代理对象中的方法的method实例
     */
    @Override
    public TrainStation intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
        return (TrainStation) methodProxy.invokeSuper(o, args);
    }
}
