package com.pyhita.design_pattern.chain_of_responsibility.linkedlist_pattern;

/**
 * @Author: kante_yang
 * @Date: 2024/2/27
 */
public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }


    public void handle() {
        // 进行处理方法
        boolean handled = doHandle();
        if (successor != null && !handled) {
            // 调用下一个handler
            successor.handle();
        }
    }

    // 留给子类进行扩展：doHandler
    protected abstract boolean doHandle();

}
