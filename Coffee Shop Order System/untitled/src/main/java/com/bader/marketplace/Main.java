package com.bader.marketplace;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){


        // Create a User
        User user = new User("Ali", 1, "ali@email.com");
        System.out.println(user);

        // Create a Seller (inherits from User)
        Seller seller = new Seller("Sara", 2 , "sara@email.com");
        System.out.println(seller);

        // Create a Buyer (inherits from User)
        Buyer buyer = new Buyer("John", 3, "john@email.com");
        System.out.println(buyer);




    }


}
