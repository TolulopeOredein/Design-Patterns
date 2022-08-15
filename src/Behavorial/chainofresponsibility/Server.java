package Behavorial.chainofresponsibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Server {

    private FoodServiceChain s1 ;
    private FoodServiceChain s2;
   // private FoodServiceChain s3;
   static List<String> list = Arrays.asList(" Amala ", " Goat Meat", " Ogbono");

    public Server(){
        this.s1 = new AmalaService();
        FoodServiceChain s2 = new MeatService();
        FoodServiceChain s3 = new SoupService();
        s1.setNextFoodService(s2);
        s2.setNextFoodService(s3);

    }

    public static void main(String[] args) {

        Server server = new Server();
        server.s1.foodService(new Food(list));


    }
}
