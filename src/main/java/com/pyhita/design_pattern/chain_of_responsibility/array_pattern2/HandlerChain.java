package com.pyhita.design_pattern.chain_of_responsibility.array_pattern2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class HandlerChain {

    List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            handler.handle();
        }
    }

}
