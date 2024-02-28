package com.pyhita.design_pattern.chain_of_responsibility.linkedlist_pattern2;

/**
 * @Author: kante_yang
 * @Date: 2024/2/28
 */
public class Application {

    public static void main(String[] args) {

        HandlerA handlerA = new HandlerA();
        HandlerB handlerB = new HandlerB();
        HandlerChain chain = new HandlerChain();

        chain.addHandler(handlerA);
        chain.addHandler(handlerB);
        chain.handle();
    }

}
