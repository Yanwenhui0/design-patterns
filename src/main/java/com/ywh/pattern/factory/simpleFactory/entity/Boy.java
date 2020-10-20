package com.ywh.pattern.factory.simpleFactory.entity;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/20
 */
public class Boy implements People {

    @Override
    public void walk() {
        System.out.println("boy 快快的跑");
    }
}
