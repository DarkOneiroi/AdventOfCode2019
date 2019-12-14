public class IntCodeComputer {
    public int result = 0;
    protected int inputNoun = 0;
    protected int inputVerb = 0;

    public void IntCode() {
        int[] code = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,13,19,1,9,19,23,1,6,23,27,2,27,9,31,2,6,31,35,1,5,35,39,1,10,39,43,1,43,13,47,1,47,9,51,1,51,9,55,1,55,9,59,2,9,59,63,2,9,63,67,1,5,67,71,2,13,71,75,1,6,75,79,1,10,79,83,2,6,83,87,1,87,5,91,1,91,9,95,1,95,10,99,2,9,99,103,1,5,103,107,1,5,107,111,2,111,10,115,1,6,115,119,2,10,119,123,1,6,123,127,1,127,5,131,2,9,131,135,1,5,135,139,1,139,10,143,1,143,2,147,1,147,5,0,99,2,0,14,0};
        code[1] = inputNoun;
        code[2] = inputVerb;
        for (int i = 0; i < code.length; i++) {
            if (((i % 4) == 0) && ((code[i]) < code.length) && ((code[i+1]) < code.length) && ((code[i+2]) < code.length) && ((code[i+3]) < code.length)) {
                int positionA = code[i];
                int positionB = code[code[i + 1]];
                int positionC = code[code[i + 2]];
                int positionD = code[i + 3];
                switch (positionA) {
                    case 1://addition
                        code[positionD] = positionB + positionC;
                        continue;
                    case 2://multiplies
                        code[positionD] = positionB * positionC;
                        continue;
                    case 99://finished
                        i = code.length;
                        result = code[0];
                        break;
                    default://mistake
                        System.out.println("Stala se chyba, chybicka se stala....");
                        break;
                }
            }
        }
    }


    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getInputVerb() {
        return inputVerb;
    }

    public void setInputVerb(int inputVerb) {
        this.inputVerb = inputVerb;
    }

    public int getInputNoun() {
        return inputNoun;
    }

    public void setInputNoun(int inputNoun) {
        this.inputNoun = inputNoun;
    }
}