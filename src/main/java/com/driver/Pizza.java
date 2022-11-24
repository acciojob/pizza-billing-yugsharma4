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
        if(this.isVeg) {
            this.price = 300;
        }
        else {
            this.price = 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        //check extra cheese added first time or not with isCheeseAdded variable
        if(!this.isCheeseAdded) {
            this.price += 80;
            this.isCheeseAdded = true;
        }
//        }else if(this.isCheeseAdded){
//             this.price += 80;
//        }else{
//            this.isToppingsAdded = false;
//        }

    }

    public void addExtraToppings(){
        // your code goes here

        //check extra cheese added should be added first then toppings should be added
        //ExtraCheese method should call first so to check we should use isToppingAdded variable and it must be false for the first time addition
        if(!this.isToppingsAdded) {
            if (this.isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
            this.isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isPaperBagAdded) {
            this.price += 20;
            this.isPaperBagAdded = true;
        }

    }

    public String getBill(){
        // your code goes here
        if(this.isVeg) this.bill = "Base Price Of The Pizza: 300 \n";
        else this.bill = "Base Price Of The Pizza: 400 \n";

        if(this.isCheeseAdded) this.bill += "Extra Cheese Added: 80 \n";

        if(this.isVeg && this.isToppingsAdded)  this.bill += "Extra Toppings Added: 70 \n";
        if(!this.isVeg  && this.isToppingsAdded) this.bill += "Extra Toppings Added: 120 \n";
        if(this.isPaperBagAdded) this.bill += "Paperbag Added: 20 \n";
        this.bill += "Total Price: " + this.price + "\n";

        return this.bill;
    }
}
