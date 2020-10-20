package com.ywh.pattern.factory.abstractFactory;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/10/20
 */
public class abstractFactoryMain {

    public static void main(String[] args) {
        System.out.println("联想拯救者配置：");
        ComputerFactory Y9000 = new Y9000ComputerFactory();
        Y9000.computerCPU().CPUName();
        Y9000.computerMemory().memoryName();
        Y9000.computerKeyboard().KeyboardName();

        System.out.println("华为metabook配置：");
        ComputerFactory Metabook = new MetabookComputerFactory();
        Metabook.computerCPU().CPUName();
        Metabook.computerMemory().memoryName();
        Metabook.computerKeyboard().KeyboardName();
    }

}
