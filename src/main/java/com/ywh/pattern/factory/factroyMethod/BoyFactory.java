package com.ywh.pattern.factory.factroyMethod;

import com.ywh.pattern.factory.factroyMethod.entity.Boy;
import com.ywh.pattern.factory.factroyMethod.entity.People;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/21
 */
public class BoyFactory implements PeopleFactory {
    @Override
    public People createPeople() {
        return new Boy();
    }
}
