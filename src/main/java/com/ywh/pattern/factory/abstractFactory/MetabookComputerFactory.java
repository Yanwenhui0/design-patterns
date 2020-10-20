package com.ywh.pattern.factory.abstractFactory;

import com.ywh.pattern.factory.abstractFactory.entity.*;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/20
 */
public class MetabookComputerFactory implements ComputerFactory {
    @Override
    public CPU computerCPU() {
        return new RCPU();
    }

    @Override
    public Memory computerMemory() {
        return new SumSungMemory();
    }

    @Override
    public Keyboard computerKeyboard() {
        return new MumarKeyboard();
    }
}
