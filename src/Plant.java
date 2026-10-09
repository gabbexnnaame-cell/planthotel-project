public abstract class Plant implements LiquidRequirements {

    private final String name;
    private final double height;

    protected Plant(String name, double height){
        this.name = name;
        this.height = height;
    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }


    @Override
    public abstract double calculateDailyAmountLitres();

    @Override
    public abstract LiquidType getLiquidType();
}
