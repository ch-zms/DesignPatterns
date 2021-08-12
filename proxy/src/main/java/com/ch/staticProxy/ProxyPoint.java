package com.ch.staticProxy;

/**
 * 代售点
 * @author CH
 * @date 2021-08-12 9:35
 */
public class ProxyPoint implements SellTickets{
    private final TrainStation station = new TrainStation();
    @Override
    public void sell() {
        System.out.println("收取一些费用...");
        station.sell();
    }
}
