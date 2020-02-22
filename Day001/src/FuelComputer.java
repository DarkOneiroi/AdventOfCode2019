public class FuelComputer {
    private int[] moduleMass = {};
    private int Fuel = 0;

    public FuelComputer(int[] moduleMass) {
        this.moduleMass = moduleMass;
        this.FuelComputerCompute();
    }

    public int getFuel() {
        return Fuel;
    }

    private void FuelComputerCompute() {
        for (int i:this.moduleMass) {
            this.Fuel+=i/3-2; //delene cislo ma byt zaokrouhleno dolu, kdyz jsem zvolil vysledku datovy typ int, tak to java vyresi za me
        }

    }
}
