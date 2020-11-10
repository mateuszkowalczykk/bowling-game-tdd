public class Game {
    int currentRoll;
    int[] rolls = new int[21];

    public void roll(int knockedPins){
        rolls[currentRoll++] = knockedPins;
    }

    public int score(){
        int result = 0;
        int rollNumber = 0;
        for (int i = 1; i <= 10; i++) {

            if(isSpare(rollNumber)){
                result+= 10 + rolls[rollNumber+2];
            }else if(rolls[rollNumber] == 10) {
                result+= 10 + rolls[rollNumber+1] + rolls[rollNumber+2];
                rollNumber--;
            }else{
                result += rolls[rollNumber] + rolls[rollNumber+1];
            }
            rollNumber+= 2;
        }
        return result;
    }
    private boolean isSpare(int rollNumber){
        return rolls[rollNumber] + rolls[rollNumber+1] == 10 && rolls[rollNumber] !=10 && rolls[rollNumber] !=0;
    }
}
