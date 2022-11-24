//package com.driver;
//
//public class Pizza {
//
//    private int price;
//    private int extraToppingPrice;
//    private int extraCheesePrice;
//    private int paperBagPrice;
//
//
//    private Boolean isVeg;
//    private String bill;
//
//    private boolean isCheeseAdded = false;
//    private boolean isToppingsAdded = false;
//
//    private boolean isPaperBagAdded = false;
//
//    private boolean isBillGenerated = false;
//
//
//    public Pizza(Boolean isVeg){
//        this.isVeg = isVeg;
//        this.extraCheesePrice = 80;
//        this.paperBagPrice = 20;
//        // your code goes here
//        if(this.isVeg) {
//            this.price = 300;
//            this.extraToppingPrice = 70;
//            this.bill = "Base Price Of The Pizza: 300 \n";
//        }
//        else {
//            this.price = 400;
//            this.extraToppingPrice = 120;
//            this.bill = "Base Price Of The Pizza: 400 \n";
//        }
//    }
//
//    public int getPrice(){
//        return this.price;
//    }
//
//    public void addExtraCheese(){
//        // your code goes here
//
//        //check extra cheese added first time or not with isCheeseAdded variable
//        if(!this.isCheeseAdded) {
//            this.price += this.extraCheesePrice;
//            this.isCheeseAdded = true;
//        }
//    }
//
//    public void addExtraToppings(){
//        // your code goes here
//
//        //check extra cheese added should be added first then toppings should be added
//        //ExtraCheese method should call first so to check we should use isToppingAdded variable and it must be false for the first time addition
//        if(!this.isToppingsAdded) {
//            this.price += this.extraToppingPrice;
//            this.isToppingsAdded = true;
//        }
//    }
//
//    public void addTakeaway(){
//        // your code goes here
//        if(!this.isPaperBagAdded) {
//            this.price += this.paperBagPrice;
//            this.isPaperBagAdded = true;
//        }
//
//    }
//
//    public String getBill(){
//        // your code goes here
//        if(!this.isBillGenerated){
//
//            if(this.isCheeseAdded) this.bill += "Extra Cheese Added: " +this.extraCheesePrice  + "\n";
//
//            if(this.isToppingsAdded)  this.bill += "Extra Toppings Added: "+ this.extraToppingPrice + "\n";
//
//            if(this.isPaperBagAdded) this.bill += "Paperbag Added: " + this.paperBagPrice +"\n";
//            this.bill += "Total Price: " + this.price + "\n";
//
//            this.isBillGenerated = true;
//        }
//
//        return this.bill;
//    }
//}


//---------------------copied

package com.driver;

public class Pizza {

    //private final int extraCheesePrice;
    private int price;
    private Boolean isVeg;
    private String bill;
    private int  extraCheesePrice;

    private int extraToppingPrice;

    private int takeAwayPrice;

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;

    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){

        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;
        this.extraCheesePrice = 80;
        this.isVeg = isVeg;

        this.takeAwayPrice = 20;
        if(isVeg==true){

            this.price = 300;
            this.extraToppingPrice = 70;
        }
        else{
            this.price = 400;
            this.extraToppingPrice = 120;
        }

        this.bill = "Base Price Of The Pizza: "+this.price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(isCheeseAdded==false){

            this.price = this.price + this.extraCheesePrice;
            isCheeseAdded = true; //I dont want it to be added repeatedly
        }
    }

    public void addExtraToppings(){

        if(isToppingAdded==false){
            this.price = this.price + this.extraToppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){

        if(isTakeAwayAdded==false){
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){

        if(isBillGenerated==false) {

            isBillGenerated = true;

            if (isCheeseAdded == true) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if (isToppingAdded == true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
            }
            if (isTakeAwayAdded == true) {
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: "+this.price + "\n";
        }
        return this.bill;
    }
}