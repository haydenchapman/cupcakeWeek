import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();

        Cupcake cupcake = new Cupcake();

        RedVelvet redVelvet = new RedVelvet();

        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. " +
                "We currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");

        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        //redVelvet

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");

        redVelvet.type();

        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        //choco
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");

        chocolate.type();

        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        //menu add

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        //drinksMenu
        ArrayList<Drink> drinkMenu = new ArrayList<>();

        Drink water = new Drink();

        Soda soda = new Soda();

        Milk milk = new Milk();

        //setDrinks
        //water
        System.out.println("We are in the middle of creating the drink menu. We currently have three types of drinks on\n" +
                "the menu but we need to decide on pricing");

        System.out.println("Deciding on price of bottle water. Description:");
        water.type();
        System.out.println("""
                How much would you like to charge for the water bottle?

                (Input a numerical number taken to 2 decimal places)""");
        priceText =input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);

        //soda
        System.out.println("Deciding on price of bottle soda. Description:");
        soda.type();
        System.out.println("""
                How much would you like to charge for the soda bottle?

                (Input a numerical number taken to 2 decimal places)""");
        priceText =input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);

        //milk
        System.out.println("Deciding on price of bottled milk. Description:");
        milk.type();
        System.out.println("""
                How much would you like to charge for the milk bottle?

                (Input a numerical number taken to 2 decimal places)""");
        priceText =input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);

        //add drinks
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu, drinkMenu);
    }
    //main end
}
class Cupcake {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

class RedVelvet extends Cupcake {

    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}

class Chocolate extends Cupcake {
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}

//drinks

class Drink {
    public double price;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void type(){
        System.out.println("A bottle of H20!");
    }
}

class Soda extends Drink {
    public void type(){
        System.out.println("A bottle of soda!");
    }
}

class Milk extends Drink {
    public void type(){
        System.out.println("A bottle of milk!");
    }
}
