package Strategy.strategy_discount;

public interface PricingStrategy {
    void calculatePrice(int price,boolean isSingedUpForNewsLatter);
}
