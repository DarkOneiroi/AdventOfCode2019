public class FuelComputer {
    private int[] moduleMass = {};
    private int Fuel = 0;

    public int getFuel() {
        return Fuel;
    }

    public FuelComputer(int[] moduleMass) {
        this.moduleMass = moduleMass;
        this.FuelComputerCompute();
    }

    private void FuelComputerCompute() {
        for (int i : moduleMass) {//iterace vsech hmotnosti
            int fuelMass = i / 3 - 2;//delene cislo ma byt zaokrouhleno dolu, kdyz jsem zvolil vysledku datovy typ int, tak to java vyresi za me; celkova hmotnost paliva jednoho modulu
            int currentFuel = fuelMass;
            while (currentFuel > 0) {
                currentFuel = currentFuel / 3 - 2;
                if (currentFuel > 0) {//pokud palivo neni v zapornych cislech, pricteme jej k celkovemu palivu
                    fuelMass += currentFuel;
                }
            }
            Fuel += fuelMass;
        }
    }
}
