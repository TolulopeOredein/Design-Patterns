package Behavorial.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class MeatService implements FoodServiceChain {
    List<String>list;
    private FoodServiceChain chain;
    @Override
    public void setNextFoodService(FoodServiceChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void foodService(Food food) {
        String meat = food.getFood(1);
        this.chain.foodService(food);
        System.out.println("Please take your Meat" + meat);
    }
}
