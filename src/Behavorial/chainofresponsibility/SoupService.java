package Behavorial.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class SoupService implements FoodServiceChain {
    List<String> list;
    private FoodServiceChain chain;
    @Override
    public void setNextFoodService(FoodServiceChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void foodService(Food food) {
        String soup = food.getFood(2);
       // this.chain.foodService(food);
       System.out.println("Please take your Soup" + soup);
    }
}
