// ARV: Palm ärver egenskaper från Plant.
public class Palm extends Plant {

    // INKAPSLING: Konstanten är private och kan inte nås direkt från andra klasser.
    private static final double LITRES_PER_METER = 0.5;

    public Palm(String name, double heightInMetres) {
        super(name, heightInMetres);
    }

    //POLYMORFISM: Palm har sin egen implementation av metoden som deklareras i superklassen Plant.
    @Override
    public double calculateDailyAmountLitres() {
        return LITRES_PER_METER * getHeight();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }
}
