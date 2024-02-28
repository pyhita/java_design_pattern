package com.pyhita.design_pattern.chain_of_responsibility.array_pattern;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class HandlerB implements IHandler{

    @Override
    public boolean handle() {
        System.out.println("HandlerB .... ");
        return false;
    }
}
