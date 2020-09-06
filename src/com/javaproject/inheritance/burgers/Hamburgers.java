package com.javaproject.inheritance.burgers;

public class Hamburgers {
    private String name, rollType;
    private int basePrice, meat, lettuce = 6, tomatoes = 2, carrot = 2, greenBean = 4;

    public Hamburgers(String name, String rollType) {
        this.name = name;
        this.meat = 2;
        this.rollType = rollType;
        this.basePrice = this.meat + 5;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return basePrice;
    }

    public int getMeat() {
        return meat;
    }

    public String getRollType() {
        return rollType;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomotoes() {
        return tomatoes;
    }

    public int getCarrot() {
        return carrot;
    }

    public int getGreenBean() {
        return greenBean;
    }

    protected void burger(int lettuce, int tomatoes, int carrot, int greenBean) {
        this.lettuce = lettuce;
        this.tomatoes = tomatoes;
        this.carrot = carrot;
        this.greenBean = greenBean;
        int burgerWithChoosingAddition = this.basePrice + this.lettuce + this.carrot + this.tomatoes + this.greenBean;
         additions();
        System.out.println("The burger price " + burgerWithChoosingAddition + "$");
    }


    public int additions() {
        int burgerWithAdditions = this.basePrice + this.lettuce + this.tomatoes + this.carrot + this.greenBean;
        System.out.println("The  base burger price with addition is " + burgerWithAdditions + "$");
        System.out.println("The base burger price: " + basePrice + "$\nLettuce : " + this.lettuce + "$\nMeat : " + this.meat
                + "$\nRolltype : Base Burger Bread Roll  \nCarrot : " + this.carrot + "$\nGreen Beans : " + this.greenBean + "$ \nTomatoes :" +
                this.tomatoes + "$");
return burgerWithAdditions;
    }

}

class HealthyBurgers extends Hamburgers {
    public HealthyBurgers() {
        super("Healthy Burger", "Brown rye Bread roll");
    }

    public void burger(int condiments, int addictives) {
        if(condiments < 0 || addictives < 0){
            System.out.println("It is impossible to place your order");
        }
      else{
          int healthBurger =  additions() + condiments + addictives;
        System.out.println("The Healthy Burger is " + healthBurger + "$");
      }
    }
}

class DeluxeHamburger extends Hamburgers {
    public DeluxeHamburger() {
        super("Deluxe Burger", "Bread Deluxe Roll");
    }

    @Override
    protected void burger(int lettuce, int tomatoes, int carrot, int greenBean) {
        super.burger(lettuce, tomatoes, carrot, greenBean);
        int chip = 5;
        int drinks = 4;
        int deluxeBurger = getPrice() + chip + drinks;
        if (lettuce < 0 && tomatoes < 0 && carrot < 0 && greenBean < 0) {
            System.out.println("The Deluxe Burger only comes with chips and drink. \nThank you");
        }
        else if(lettuce > 0 && tomatoes>= 0 && carrot > 0 && greenBean > 0){
            System.out.println("The Deluxe Burger only comes with chips and drink. \nThank you");
        }
          else {
              super.additions();
            System.out.println("The Deluxe Burger is " + deluxeBurger + "$");
          }
        }
    }

class Main {
    public static void main(String[] args) {
        HealthyBurgers healthyBurgers = new HealthyBurgers();
        DeluxeHamburger deluxeBurgers = new DeluxeHamburger();
        deluxeBurgers.burger(1,1,1,1);
        System.out.println("-----------------------------------");
        deluxeBurgers.burger(1, 1, 1, 1);
//         healthyBurgers.burger(2, 2);
//         Hamburgers burgerss= new Hamburgers("Hamburger", "Bread local roll");
//        healthyBurgers.burger(-1, -2);
        System.out.println("-----------------------------------");

    }
}