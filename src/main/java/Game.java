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
            result += rolls[rollNumber] + rolls[rollNumber+1];
            if(rolls[rollNumber] + rolls[rollNumber+1]==10){//spare
                result+=rolls[rollNumber+2];
            }
            rollNumber+= 2;
        }
        return result;
    }
}
