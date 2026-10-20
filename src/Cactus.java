// ARV: Cactus ärver från Plant.
public class Cactus extends Plant {

    // INKAPSLING: Privat konstant som lagrar kaktusens dagliga vätskebehov.
    private static final double DAILY_AMOUNT_LITRES = 0.02;

    public Cactus(String name, double heightInMetres) {
        super(name, heightInMetres);
    }

    // POLYMORFISM: Cactus har sin egen implementation av metoden som deklareras i superklassen Plant.
    @Override
    public double calculateDailyAmountLitres() {
        return  DAILY_AMOUNT_LITRES;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
