package com.ywh.pattern.factory.abstractFactory;

import com.ywh.pattern.factory.abstractFactory.entity.CPU;
import com.ywh.pattern.factory.abstractFactory.entity.Keyboard;
import com.ywh.pattern.factory.abstractFactory.entity.Memory;
import lombok.Getter;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/20
 */
public interface ComputerFactory {

    CPU computerCPU();

    Memory computerMemory();

    Keyboard computerKeyboard();

}
