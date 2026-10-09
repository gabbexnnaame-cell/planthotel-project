public class Cactus extends Plant {

    private static final double daily_amount_litres = 0.02;

    public Cactus(String name, double heightInMetres){
        super(name, heightInMetres);
    }

    @Override
    public double calculateDailyAmountLitres() {
        return  daily_amount_litres;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
