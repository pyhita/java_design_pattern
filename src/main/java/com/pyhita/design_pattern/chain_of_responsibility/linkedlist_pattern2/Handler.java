package com.pyhita.design_pattern.chain_of_responsibility.linkedlist_pattern2;

import java.sql.PseudoColumnUsage;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public abstract class Handler {

    private Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public final void handle() {
        doHandle();
        if (successor != null) {
            successor.handle();
        }
    }

    protected abstract void doHandle();
}
