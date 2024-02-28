package com.pyhita.design_pattern.chain_of_responsibility.linkedlist_pattern2;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class HandlerChain {

    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}
