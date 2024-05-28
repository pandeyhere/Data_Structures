package DesignPatterns;


interface Strategy{
    void processPayment(double amount);;
}
public class StrategyUse {
    Strategy strategy;

    public StrategyUse(Strategy strategy){
        this.strategy=strategy;
    }

    public void processPayment(double amount){
        strategy.processPayment(amount);
    }

}
