package com.pyhita.design_pattern.chain_of_responsibility.linkedlist_pattern;

/**
 * @Author: kante_yang
 * @Date: 2024/2/27
 */
// handler 链表
public class HandlerChain {

    private Handler head;
    private Handler tail;

    public void addHandler(Handler handler) {
        if (head == null) {
            // 链表是空的
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
