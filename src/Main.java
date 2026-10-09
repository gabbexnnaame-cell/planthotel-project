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

            int choice = getInteger(scanner);
            Plant selectedPlant = null;

            switch (choice) {
                case 1:
                    selectedPlant = plants.get(0);
                    break;
                case 2:
                    selectedPlant = plants.get(1);
                    break;
                case 3:
                    selectedPlant = plants.get(2);
                    break;
                case 4:
                    selectedPlant = plants.get(3);
                    break;
                case 5:
                    System.out.println("Avslutar programmet...");
                    return;
                default:
                    System.out.println("Ogiltigt val.");
            }

            if (selectedPlant != null){
                displayLiquidRequirements(selectedPlant);
            }
        }


    }

    public static void displayLiquidRequirements(Plant plant){
        System.out.println("---" + plant.getName() + "s vätskebehov---");
        System.out.println("Liquidtype:" + " " + (plant.getLiquidType().getDisplayName()));
        System.out.println("Liquidamount:" + " " + (plant.calculateDailyAmountLitres()) + "L");
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

    public static int getInteger(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            System.out.println("Ogiltigt val. Ange ett heltal!");
            scanner.next();
        }

        return scanner.nextInt();

    }
}
