import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // POLYMORFISM: ArrayListan kan innehålla olika subklasser av Plant, eftersom Palm, Cactus
        // och CarnivorousPlant ärver från Plant.
        ArrayList<Plant> plants = new ArrayList<>();

        for (HotelPlant hotelPlant : HotelPlant.values()) {

            switch (hotelPlant.getPlantType()) {
                // ARV OCH POLYMORFISM: Vi skapar rätt subklass och lägger objektet i
                // en lista av typen Plant.
                case PALM:
                    plants.add(new Palm(
                            hotelPlant.getName(),
                            hotelPlant.getHeight()));
                    break;

                case CACTUS:
                    plants.add(new Cactus(
                            hotelPlant.getName(),
                            hotelPlant.getHeight()));
                    break;

                case CARNIVOROUS:
                    plants.add(new CarnivorousPlant(
                            hotelPlant.getName(),
                            hotelPlant.getHeight()));
                    break;
            }
        }


        while (true) {

            showMenu();

            String plantNameInput = scanner.nextLine().trim();

            if (plantNameInput.equalsIgnoreCase("avsluta")) {
                System.out.println("Avslutar programmet...");
                break;
            }

            Plant selectedPlant = null;

            for (Plant plant : plants) {
                if (plant.getName().equalsIgnoreCase(plantNameInput)) {
                    selectedPlant = plant;
                    break;
                }
            }

            if (selectedPlant != null) {
                displayLiquidRequirements(selectedPlant); //Polymorphism
            } else {
                System.out.println("Hittade ingen växt med det namnet. Försök igen!");
            }

        }

        scanner.close();
    }

public static void displayLiquidRequirements(Plant plant) {
    // POLYMORFISM: Den faktiska växtens implementation av metoden anropas beroende på om objektet.
    // är en Palm, Cactus eller CarnivorousPlant
    System.out.println("---" + plant.getName() + "s vätskebehov---");
    System.out.println(plant.getName() + " " + "är en" + " " + plant.getClass().getSimpleName());
    System.out.println("Liquidtype:" + " " + (plant.getLiquidType().getDisplayName()));
    System.out.println("Liquidamount:" + " " + (plant.calculateDailyAmountLitres()) + "L");
}


public static void showMenu() {

    System.out.println("--- Vilken växt ska få vätska ---");

    for (HotelPlant hotelPlant : HotelPlant.values()) {
        System.out.println("- " + hotelPlant.getName());
    }

    System.out.println("Skriv önskad växts namn eller 'avsluta' för att avsluta programmet:");
}
}