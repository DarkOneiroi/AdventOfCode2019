public class InputItt {
    public void InputItt(){
        int noun = 0;
        int verb = 0;
        int result;
        int output = 19690720;

        IntCodeComputer intCode = new IntCodeComputer();
        while (noun < 100){//itteration of nouns
            verb = 0;//reset of verbs in next noun loop
            while (verb < 100){//itteration of verbs
                intCode.setInputVerb(verb);
                intCode.IntCode();
                result = intCode.getResult();
                if(result == output) {
                    noun--;
                    System.out.printf("Vysledek noun: %d a verb: %d, celkovy output: %d", noun, verb, result);
                    break;
                }
                verb++;
            }
            intCode.setInputNoun(noun);
            intCode.IntCode();
            result = intCode.getResult();
            if(result == output) {
                System.out.printf("Vysledek noun: %d a verb: %d, celkovy output: %d", (noun - 1), verb, result);
                break;
            }
            noun++;
        }
    }
}
