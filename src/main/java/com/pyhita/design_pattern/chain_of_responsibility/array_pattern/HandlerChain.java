package com.pyhita.design_pattern.chain_of_responsibility.array_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class HandlerChain {

    List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                break;
            }
        }
    }

}
