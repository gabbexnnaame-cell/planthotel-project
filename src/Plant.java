// ARV: Palm, Cactus och CarnivorousPlant ärver från Plant.
// INTERFACE: Plant implementerar LiquidRequirements.
public abstract class Plant implements LiquidRequirements {


    //INKAPSLING : Instansvariablerna är private och kan nås via publika getters.
    private final String name;
    private final double height;

    protected Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    //POLYMORFISM: Subklasserna implementerar dessa metoder på olika sätt.
    @Override
    public abstract double calculateDailyAmountLitres();

    @Override
    public abstract LiquidType getLiquidType();
}
