package com.ywh.pattern.factory.abstractFactory.entity;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/20
 */
public class RCPU implements CPU {
    @Override
    public void CPUName() {
        System.out.println("锐龙处理器");
    }
}
