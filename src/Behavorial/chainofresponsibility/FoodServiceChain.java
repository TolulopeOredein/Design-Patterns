package Behavorial.chainofresponsibility;

public interface FoodServiceChain {
    void setNextFoodService(FoodServiceChain foodServiceChain);
    void foodService(Food food);
}
