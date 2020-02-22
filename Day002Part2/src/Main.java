public class Main {

    public static void main(String[] args) {
        int noun;
        int verb;
        int result;
        int output = 19690720; //correct comnbination of noun and verb is 4925

        InputItt inputItt = new InputItt(output);

        result = inputItt.getResult();
        noun = inputItt.getNoun();
        verb = inputItt.getVerb();

        System.out.printf("Vysledek noun: %d a verb: %d, pro spocitany output: %d", noun, verb, result);
    }
}
