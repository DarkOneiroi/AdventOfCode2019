public class Main {

    public static void main(String[] args) {
        int[] moduleMass = {124846,99745,110203,140165,110228,65706,128481,75921,57331,72951,133413,99524,79546,54653,55166,66215,147696,91054,64752,76311,139572,61110,65846,121489,147534,66591,109963,83412,138965,70102,128844,141002,77655,68539,128687,70559,140747,51397,117550,91515,60960,133280,83244,106644,100333,67608,118120,60024,115547,136229,108403,128776,109599,111189,98538,129715,116630,120772,80105,52489,130247,144003,85226,83769,137921,54737,126406,108756,149633,138201,78980,126909,125768,86214,54873,97723,92677,120405,143317,102981,142668,100398,67258,126583,114611,102525,115205,78329,140703,136978,94465,129510,81039,141997,120643,55377,113672,89966,112665,51323};
        int Fuel = 0;//celkova hmotnost paliva vsech modulu
        for (int i:moduleMass) {//iterace vsech hmotnosti
            int fuelMass = i / 3 - 2;//delene cislo ma byt zaokrouhleno dolu, kdyz jsem zvolil vysledku datovy typ int, tak to java vyresi za me; celkova hmotnost paliva jednoho modulu
            int currentFuel = fuelMass;
            while(currentFuel>0) {
                currentFuel = currentFuel / 3 - 2;
                if(currentFuel>0) {//pokud palivo neni v zapornych cislech, pricteme jej k celkovemu palivu
                    fuelMass += currentFuel;
                }
            }
            Fuel += fuelMass;
        }
        System.out.printf("Bude potreba %d paliva.", Fuel);
        /*
        Spravna odpoved je 5105716
         */
    }
}