public enum LiquidType {

    TAP_WATER("kranvatten"),
    MINERAL_WATER("mineralvatten"),
    PROTEIN_DRINK("proteindryck");

    // INKAPSLING: Instansvariabeln är private och nås utifrån via getDisplayName().
    private final String displayName;

    LiquidType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
