package com.ywh.pattern.factory.factroyMethod;

import com.ywh.pattern.factory.factroyMethod.entity.People;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/21
 */
public class FactoryMethodMain {

    public static void main(String[] args) {
        People boy = new BoyFactory().createPeople();
        People girl = new GirlFactory().createPeople();
        boy.walk();
        girl.walk();
    }
}
