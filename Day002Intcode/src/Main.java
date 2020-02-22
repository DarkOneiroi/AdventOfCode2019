public class Main {

    public static void main(String[] args) {
        //Počáteční hodnoty
        int codeFirst = 12;
        int codeSecond = 02;
        int result;

        //Inicializace třídy vykonávající zpracování zadaných dat
        IntCodeComputer intCodeComputer = new IntCodeComputer(codeFirst, codeSecond);
        result = intCodeComputer.getResult();

        System.out.printf("%nVysledek je %n%d%nPadej%n%n", result);


    }
}
