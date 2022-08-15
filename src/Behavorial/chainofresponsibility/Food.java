package Behavorial.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class Food {
    public  static List<String> food;
    public Food(List<String> food){
        this.food= food;

    }
    public String getFood(int i){

        return food.get(i);
    }
}
