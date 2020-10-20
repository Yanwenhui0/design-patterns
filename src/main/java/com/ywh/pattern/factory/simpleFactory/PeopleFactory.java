package com.ywh.pattern.factory.simpleFactory;

import com.ywh.pattern.factory.simpleFactory.entity.Boy;
import com.ywh.pattern.factory.simpleFactory.entity.People;
import com.ywh.pattern.factory.simpleFactory.entity.girl;

/**
 * @author : yanwenhui
 * @description : 简单工厂的两种实现
 * @date : 2020/10/20
 */
public class PeopleFactory {

    /**
     * 简单工厂第一种实现
     * @param people
     * @return
     */
    public static People getPeople(String people) {
        switch (people) {
            case "girl":
                return new girl();
            case "boy":
            default:
                return new Boy();
        }
    }

    public static People getBoy() {
        return new Boy();
    }

    public static People getGirl() {
        return new girl();
    }

}
