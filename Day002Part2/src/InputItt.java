public class InputItt {
    private int noun = 0;
    private int verb = 0;
    private int result;
    private int output;

    public InputItt(int output) {
        this.output = output;
        InputIttCompute();
    }

    private void InputIttCompute() {
        while (noun < 100) {//itteration of nouns
            verb = 0;//reset of verbs in next noun loop
            while (verb < 100) {//itteration of verbs
                IntCodeComputer intCode = new IntCodeComputer(noun, verb);
                result = intCode.getResult();
                if (result == output) {
                    break;//end of verb loop before itteration, otherwise you have to decrease verb by one
                } else {
                    verb++;
                }
            }
            IntCodeComputer intCode = new IntCodeComputer(noun, verb);
            result = intCode.getResult();
            if (result == output) {
                break;//end of noun loop before itteration, otherwise you have to decrease verb by one
            } else {
                noun++;
            }
        }
    }

    public int getNoun() {
        return noun;
    }

    public int getVerb() {
        return verb;
    }

    public int getResult() {
        return result;
    }
}
