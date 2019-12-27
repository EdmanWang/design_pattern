package com.wgx.desgin_pattern.strategy_pattern;

public class StrategyParttenTest {

    private Double salary;

    private Double bonus;

    public StrategyParttenTest(Double salary, Double bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Double cal() {
        return strategy.calculate(salary, bonus);
    }

    public static void main(String[] args) {
        StrategyParttenTest strategyParttenTest = new StrategyParttenTest(10000d, 2000d);
        // 将行为的主动权交给用户自己去选择，选择他想要的一种策略
        strategyParttenTest.setStrategy(new StrategyA());
        Double cal = strategyParttenTest.cal();
        System.out.println(cal);
    }
}
