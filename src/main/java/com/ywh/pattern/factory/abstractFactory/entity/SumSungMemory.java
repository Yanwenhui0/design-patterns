package com.ywh.pattern.factory.abstractFactory.entity;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/20
 */
public class SumSungMemory implements Memory {
    @Override
    public void memoryName() {
        System.out.println("三星内存条");
    }
}
