public class Palm extends Plant {

    private static final double litres_per_meter = 0.5;

    public Palm(String name, double heightInMetres){
        super(name, heightInMetres);
    }

    @Override
    public double calculateDailyAmountLitres() {
        return litres_per_meter * getHeight();
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }
}
