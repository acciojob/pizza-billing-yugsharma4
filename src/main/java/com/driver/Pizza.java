package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isCheeseAdded = false;
    private boolean isToppingsAdded = false;

    private boolean isPaperBagAdded = false;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg) this.price = 300;
        else this.price = 400;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        //check extra cheese added first time or not with isCheeseAdded variable
        //ExtraCheese method should call first so to check we should use isToppingAdded variable to false
        if(!isCheeseAdded && !isToppingsAdded){
            this.price += 80;
            System.out.println("Extra Cheese Added: 80\n");
            this.isCheeseAdded = true;
            this.isToppingsAdded = false;
        }else if(isToppingsAdded){
//            System.out.println("You should add extra cheese first!!!");
            this.isToppingsAdded = false;
        }

    }

    public void addExtraToppings(){
        // your code goes here

        //check extra cheese added should be added first then toppings should be added
        //ExtraCheese method should call first so to check we should use isToppingAdded variable and it must be false for the first time addition
        if(this.isCheeseAdded && !this.isToppingsAdded){
            this.price += 70;
            System.out.println("Extra Toppings Added: 70\n");
            this.isToppingsAdded = true;
        }else if(!this.isCheeseAdded){
//            System.out.println("Please add extra cheese first!!!\n");
        }

    }

    public void addTakeaway(){
        // your code goes here

        //check whether paper bag added for the first time or not
        if(!isPaperBagAdded){
            this.price += 20;
            this.isPaperBagAdded = true;
            System.out.println("Paperbag Added: 20\n");
        }


    }

    public String getBill(){
        // your code goes here
        this.bill = this.price + "";
        System.out.println("Total Price: " + this.bill);
        return this.bill;
    }
}
