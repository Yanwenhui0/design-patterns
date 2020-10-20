package com.ywh.pattern.factory.abstractFactory.entity;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/20
 */
public class InterCPU implements CPU {
    @Override
    public void CPUName() {
        System.out.println("英特尔处理器");
    }
}
