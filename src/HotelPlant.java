public enum HotelPlant {

    LAURA( "Laura",5.0, PlantType.PALM),
    OLOF("Olof", 1.0, PlantType.PALM),
    IGGE("Igge", 0.2, PlantType.CACTUS),
    MEATLOAF("Meatloaf", 0.7, PlantType.CARNIVOROUS);

    // INKAPSLING: Instansvariablerna är private och nås via getters i andra klasser som ger
    // kontrollerad åtkomst.
    private final String name;
    private final double height;
    private final PlantType plantType;

    HotelPlant(String name, double height, PlantType plantType) {
        this.name = name;
        this.height = height;
        this.plantType = plantType;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public PlantType getPlantType() {
        return plantType;
    }
}