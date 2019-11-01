package com.wgx.desgin_pattern.strategy_parttern;

public class StrategyA implements Strategy {
    @Override
    public Double calculate(Double salary, Double bonus) {
        return salary * 0.1 + bonus * 0.2;
    }
}
