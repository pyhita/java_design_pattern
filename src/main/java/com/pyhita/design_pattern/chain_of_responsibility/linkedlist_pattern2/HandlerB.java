package com.pyhita.design_pattern.chain_of_responsibility.linkedlist_pattern2;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class HandlerB extends Handler {

    @Override
    protected void doHandle() {
        System.out.println("HandlerB .... ");
    }
}
