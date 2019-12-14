public class Main {

    public static void main(String[] args) {
        int[] code={1,0,0,0,99};
        //code[1]=12;
        //code[2]=2;

        for (int i = 0; i < code.length; i++) {
            System.out.printf("Prave kontroluji cislo %d, na pozici %d%n", code[i], i);
            if((i%4)==0) {
                int positionA = code[i];
                System.out.printf("Pozice A %d coz je pozice %d%n", positionA, i);
                int positionB = code[code[i+1]];
                System.out.printf("Pozice B %d coz je pozice %d%n", positionB, i+1);
                int positionC = code[code[i+2]];
                System.out.printf("Pozice C %d coz je pozice %d%n", positionC, i+2);
                int positionD = code[code[i+3]];
                System.out.printf("Pozice D %d coz je pozice %d%n", positionD, i+3);
                switch (positionA) {
                    case 1://addition
                        System.out.println("Budeme scitat");
                        code[positionD]=positionB+positionC;
                        System.out.printf("Soucet je %d, na pozici %d%n", code[positionD], positionD);
                        continue;
                    case 2://multiplies
                        System.out.println("Budeme nasobit");
                        code[positionD]=positionB*positionC;
                        System.out.printf("Vysledek nasobeni je %d, na pozici %d%n", code[positionD], positionD);
                        continue;
                    case 99://finished
                        System.out.printf("%nVysledek je %n%d%nPadej%n%n", code[0]);
                        continue;
                    default://mistake
                        System.out.println("Stala se chyba, chybicka se stala....");
                        break;
                }
            }
            else {
                continue;
            }
        }

    }
}
