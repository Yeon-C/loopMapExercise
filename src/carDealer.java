import java.util.Scanner;
import java.util.*;

public class carDealer {

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        // Hashmap of cars
        HashMap<String, String> Car = new HashMap<>();
        Car.put("Civic", "Honda");
        Car.put("Accord", "Honda");
        Car.put("CR-V", "Honda");
        Car.put("Pilot", "Honda");
        Car.put("Mustang", "Ford");
        Car.put("F-150", "Ford");
        Car.put("Explorer", "Ford");
        Car.put("Escape", "Ford");
        Car.put("Camry", "Toyota");
        Car.put("Corolla", "Toyota");
        Car.put("RAV4", "Toyota");
        Car.put("Highlander", "Toyota");
        Car.put("Tacoma", "Toyota");
        Car.put("Rogue", "Nissan");
        Car.put("Sentra", "Nissan");
        Car.put("Altima", "Nissan");
        Car.put("Equinox", "Chevrolet");
        Car.put("Silverado", "Chevrolet");
        Car.put("Malibu", "Chevrolet");
        Car.put("Impala", "Chevrolet");
        Car.put("Corvette", "Chevrolet");
        Car.put("Camaro", "Chevrolet");
        Car.put("Grand Cherokee", "Jeep");
        Car.put("Wrangler", "Jeep");
        Car.put("CX-5", "Mazda");
        Car.put("Model Y", "Tesla");
        Car.put("Model S", "Tesla");
        Car.put("Model X", "Tesla");
        Car.put("Forester", "Subaru");
        Car.put("Outback", "Subaru");
        Car.put("Veloster", "Hyundai");
        Car.put("Elantra", "Hyundai");
        Car.put("Sonata", "Hyundai");
        Car.put("Tucson", "Hyundai");
        Car.put("Giulia", "Alfa Romeo");
        Car.put("Stelvio", "Alfa Romeo");
        Car.put("500X", "Fiat");
        Car.put("500L", "Fiat");
        Car.put("Cooper", "Mini");
        Car.put("Countryman", "Mini");
        Car.put("Clubman", "Mini");
        // initialize variables
        String yes = "yes";
        String no = "no";
        // step 1 ask for model
        System.out.println(" ");
        System.out.println("Welcome to Pinky's Used Cars");
        System.out.println(" ");
        System.out.println("Do you have a model in mind? (type yes/no)");
        System.out.println(" ");
        System.out.println("(Capitalize first letter of each model ex. Grand Cherokee)");
        String desire = myscan.nextLine();
        String model = Car.get(desire);
        // first while loop chunk to ask for model
        while (true) {
            if (desire.equalsIgnoreCase(no)) {
                System.out.println("Thank you, come again!");
                System.exit(0);
            } else if (desire.equalsIgnoreCase(yes)) {
                System.out.println(" ");
                System.out.println("Okay, what is it?");
                desire = myscan.nextLine();
                break;
            } else {
                System.out.println(" ");
                System.out.println("Please type yes or no ONLY");
                System.out.println(" ");
                System.out.println("Do you have a model in mind? (type yes/no)");
                desire = myscan.nextLine();
                continue;
            }
        }

        // second while loop chunk to see if model is in the hash map

        while (true) {
            model = Car.get(desire);
            if (model == null) {
                System.out.println(" ");
                System.out.println("I don't think we have that model...");
                System.out.println(" ");
                System.out.println("Do you have another model in mind? (type yes/no)");
                desire = myscan.nextLine();
                while (true) {
                    if (desire.equalsIgnoreCase(no)) {
                        System.out.println("Thank you, come again!");
                        System.exit(0);
                    } else if (desire.equalsIgnoreCase(yes)) {
                        System.out.println(" ");
                        System.out.println("Okay, what is it?");
                        desire = myscan.nextLine();
                        break;
                    } else {
                        System.out.println(" ");
                        System.out.println("Please type yes or no ONLY");
                        System.out.println(" ");
                        System.out.println("Do you have another model in mind? (type yes/no)");
                        desire = myscan.nextLine();
                        continue;
                    }
                }
            } else {
                break;
            }
        }
        // step 2 print the model and make
        System.out.println(" ");
        System.out.println("Oh, you're looking for a " + desire + "?");
        System.out.println("Our " + model + " section is right over here...");
        // step 3 ask to look for other cars
        boolean end = false;

        while (true) {
            if (model != null && end == true) {
                break;
            }
            System.out.println(" ");
            System.out.println("Would you like to look at other cars? (type yes/no) ");
            String ask = myscan.nextLine();
            while (true) {
                if (ask.equalsIgnoreCase(yes)) {
                    System.out.println(" ");
                    System.out.println("Okay, what other model are you looking for? ");
                    desire = myscan.nextLine();
                    model = Car.get(desire);
                    if (model == null) {
                        System.out.println(" ");
                        System.out.println("I don't think we have that model...");
                        break;
                    } else {
                        System.out.println(" ");
                        System.out.println("Oh, you're looking for a " + desire + "?");
                        System.out.println("Our " + model + " section is right over here...");
                        break;
                    }
                } else if (ask.equalsIgnoreCase(no)) {
                    end = true;
                    break;
                } else {
                    System.out.println(" ");
                    System.out.println("Please enter yes or no ONLY!");
                    System.out.println(" ");
                    System.out.println("Would you like to look at other cars? (type yes/no) ");
                    ask = myscan.nextLine();
                    continue;
                }

            }
        }

        System.out.println(" ");
        System.out.println("Take your time, and let me know how you like the " + model + " " + desire + "!");
        //close that scanner
        myscan.close();
        //It's not elegant, but it works... 
    }

}
