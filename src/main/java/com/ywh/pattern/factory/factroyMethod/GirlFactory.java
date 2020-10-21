package com.ywh.pattern.factory.factroyMethod;

import com.ywh.pattern.factory.factroyMethod.entity.People;
import com.ywh.pattern.factory.factroyMethod.entity.girl;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/21
 */
public class GirlFactory implements PeopleFactory {

    @Override
    public People createPeople() {
        return new girl();
    }
}
