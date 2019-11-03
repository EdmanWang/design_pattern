package com.wgx.desgin_pattern.strategy_pattern;

@FunctionalInterface
public interface Strategy {

    Double calculate(Double salary, Double bonus);
}
