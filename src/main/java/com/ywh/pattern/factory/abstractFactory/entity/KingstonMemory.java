package com.ywh.pattern.factory.abstractFactory.entity;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/20
 */
public class KingstonMemory implements Memory {
    @Override
    public void memoryName() {
        System.out.println("金士顿内存条");
    }
}
