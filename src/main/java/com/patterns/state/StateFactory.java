package com.patterns.state;

import java.util.Optional;

public class StateFactory {


    public static Optional<State> createState (StateType type){

        switch (type){
            case COIN: return Optional.of(new CoinState());
            case NOCOIN: return Optional.of(new NoCoinState());
            case SOLD: return Optional.of(new SoldState());
            case SOLDOUT: return Optional.of(new SoldOutState());
            default:
                System.out.println("This state isn't supported");
                return Optional.empty();
        }

    }

}
