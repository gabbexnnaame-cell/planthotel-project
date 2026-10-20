// ARV: CarnivorousPlant ärver från superklassen Plant.
public class CarnivorousPlant extends Plant {

    // INKAPSLING: Privata konstanter för beräkningen.
    private static final double BASE_AMOUNT_LITRES = 0.1;
    private static final double LITRES_PER_METER = 0.2;

    public CarnivorousPlant(String name, double heightInMetres) {
        super(name, heightInMetres);
    }

    // POLYMORFISM: CarnivorousPlant har sin egen implementation av metoden som deklareras i superklassen Plant.
    @Override
    public double calculateDailyAmountLitres() {
        return BASE_AMOUNT_LITRES + (LITRES_PER_METER * getHeight());
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
