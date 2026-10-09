public class CarnivorousPlant extends Plant {

    private static final double base_amount_litres = 0.1;
    private static final double litres_per_meter = 0.2;

    public CarnivorousPlant(String name, double heightInMetres){
        super(name, heightInMetres);
    }

    @Override
    public double calculateDailyAmountLitres() {
        return base_amount_litres + (litres_per_meter * getHeight());
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
