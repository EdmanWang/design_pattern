package com.wgx.desgin_pattern.strategy_parttern;

public class StrategyB implements Strategy {
    @Override
    public Double calculate(Double salary, Double bonus) {
        return salary * 0.01 + bonus * 0.02;
    }
}
