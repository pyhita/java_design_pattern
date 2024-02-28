package com.pyhita.design_pattern.chain_of_responsibility.linkedlist_pattern;

/**
 * @Author: kante_yang
 * @Date: 2024/2/27
 */
public class HandlerB extends Handler{

    @Override
    protected boolean doHandle() {
        System.out.println("HandlerB .... ");
        return false;
    }
}
