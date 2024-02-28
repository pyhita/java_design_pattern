package com.pyhita.design_pattern.chain_of_responsibility.linkedlist_pattern;

/**
 * @Author: kante_yang
 * @Date: 2024/2/27
 */
public class Application {

    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        chain.addHandler(handlerA);
        chain.addHandler(handlerB);

        chain.handle();
    }

}
