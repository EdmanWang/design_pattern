package com.wgx.desgin_pattern.strategy_parttern;

@FunctionalInterface
public interface Strategy {

    Double calculate(Double salary, Double bonus);
}
