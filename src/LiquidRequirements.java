// INTERFACE: Definerar vilka metoder som en klass måste implementera för att beräkna
// och ange vätsketyp och dagliga vätskebehovet.
public interface LiquidRequirements {

    double calculateDailyAmountLitres();

    LiquidType getLiquidType();

}
