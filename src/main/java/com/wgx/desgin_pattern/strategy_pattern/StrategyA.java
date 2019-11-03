package com.wgx.desgin_pattern.strategy_pattern;

public class StrategyA implements Strategy {
    @Override
    public Double calculate(Double salary, Double bonus) {
        return salary * 0.1 + bonus * 0.2;
    }
}
