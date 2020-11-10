public class Game {
    int currentRoll;
    int[] rolls = new int[21];

    public void roll(int knockedPins){
        rolls[currentRoll++] = knockedPins;
    }

    public int score(){
        int result = 0;
        for(int roll:rolls){
            result+= roll;
        }
        return result;
    }
}
