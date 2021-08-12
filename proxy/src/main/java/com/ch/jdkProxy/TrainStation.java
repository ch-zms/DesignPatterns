package com.ch.jdkProxy;

/**
 * 火车站
 *
 * @author CH
 * @date 2021-08-12 9:32
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
