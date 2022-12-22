import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order (ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu) {
        //orders
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> orders = new ArrayList<Object>();
        System.out.println("Hello customer! Would you like to place an order?(Y or N)");
        String placeOrder = scanner.nextLine();

        if (placeOrder.equalsIgnoreCase("Y")) {
        } else {
            System.out.println("Okay then homie, have a nice day!");
        }

        //localdatetime
        orders.add(LocalDate.now());
        orders.add(LocalTime.now());

        //menu
        System.out.println("Here is the menu:");
        System.out.println("CUPCAKES:");

        //itemNumber
        int itemNumber = 0;

        //iterate index of cupcake menu
        for(int i = 0; i < cupcakeMenu.size();i++){
            itemNumber++;

            System.out.println(itemNumber + ".");

            //add desc at i
            cupcakeMenu.get(i).type();
            System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
            System.out.println();
        }
        //drink menu
        System.out.println("DRINKS:");

        //iterate index of drink menu
        for (int i = 0; i < drinkMenu.size(); i++){
            itemNumber++;
            System.out.println(itemNumber + ".");

            //add desc at i
            drinkMenu.get(i).type();

            System.out.println("Price: $" + drinkMenu.get(i).getPrice());
        }

        System.out.println();

        boolean ordering = true;

        while(ordering=true){
            System.out.println("What would you like to order? Please use the number associated with each item to order.");
            int orderChoice = scanner.nextInt();
            scanner.nextInt();

            if (orderChoice == 1){
                orders.add(cupcakeMenu.get(0));
                System.out.println("Item added to order");
            } else if (orderChoice == 2){
                orders.add(cupcakeMenu.get(1));
            } else if (orderChoice == 3){
                orders.add(cupcakeMenu.get(2));
            } else if (orderChoice == 4){
                orders.add(drinkMenu.get(0));
            } else if (orderChoice == 5){
                orders.add(drinkMenu.get(1));
            } else if (orderChoice == 6){
                orders.add(drinkMenu.get(2));
            } else {
                System.out.println("Sorry, your selection is not on the menu.");
            }
            //continue?
            System.out.println("Would you like to continue ordering? (Y/N)");

            String continueOrder = scanner.nextLine();

            if (continueOrder.equalsIgnoreCase("Y")){
                ordering = false;
            }


        }
    }
}

