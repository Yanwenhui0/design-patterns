package com.ywh.pattern.factory.simpleFactory;

import com.ywh.pattern.factory.simpleFactory.entity.People;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/20
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        // 第一种方式
        People girl = PeopleFactory.getPeople("girl");
        girl.walk();

        // 第二种方式
        People boy = PeopleFactory.getBoy();
        boy.walk();
    }

}
