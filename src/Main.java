import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Plant> plants = new ArrayList<>();

        plants.add(new Palm("Laura", 5));
        plants.add(new Palm("Olof", 1));
        plants.add(new Cactus("Igge", 0.2));
        plants.add(new CarnivorousPlant("Meatloaf", 0.7));

        while (true) {

            showMenu();

            int choice = scanner.nextInt(); //fix and replace w/ getInteger error handling method later

            switch (choice) {
                case 1:
                    Plant selectedPlant = plants.get(0);
                        System.out.println("---Lauras vätskebehov:---");

                    break;
                case 2:
                    Plant selectedPlant1 = plants.get(1);
                    System.out.println("---Olofs vätskebehov:---");
                    System.out.println("Liquidtype:" + " " + (selectedPlant1.getLiquidType()));
                    System.out.println("Liquidamount:" + " " + (selectedPlant1.calculateDailyAmountLitres()) + "L");
                    break;
                case 3:
                    Plant selectedPlant2 = plants.get(2);
                    System.out.println("---Igges vätskebehov:---");
                    System.out.println("Liquidtype:" + " " + (selectedPlant2.getLiquidType()));
                    System.out.println("Liquidamount:" + " " + (selectedPlant2.calculateDailyAmountLitres()) + "L");
                    break;
                case 4:
                    Plant selectedPlant3 = plants.get(3);
                    System.out.println("---Meatloafs vätskebehov:---");
                    System.out.println("Liquidtype:" + " " + (selectedPlant3.getLiquidType()));
                    System.out.println("Liquidamount:" + " " + (selectedPlant3.calculateDailyAmountLitres()) + "L");
                    break;
                case 5:
                    System.out.println("Avslutar programmet...");
                    return;
                default:
                    System.out.println("Ogiltigt val.");
            }
        }
    }

    public static void displayLiquidRequirements(Plant plant){
        System.out.println("Liquidtype:" + " " + (selectedPlant.getLiquidType()));
        System.out.println("Liquidamount:" + " " + (selectedPlant.calculateDailyAmountLitres()) + "L");
    }

    public static void showMenu() {
        System.out.println("----Vilken växt ska få vetska?----");
        System.out.println("1. Laura");
        System.out.println("2. Olof");
        System.out.println("3. Igge");
        System.out.println("4. Meatloaf");
        System.out.println("5. Avsluta program");
        System.out.println("Var vänlig och mata in ett nummer!");
    }
}
