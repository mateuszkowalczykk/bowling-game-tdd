import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GameTest {
    Game game;

    void multiRoll(int... ints){
        for(int i : ints){
            game.roll(i);
        }
    }

    @BeforeEach
    void setUp(){
        game = new Game();
    }

    @Test
    void canRoll() {
        game.roll(0);
    }
    @Test
    void canScore() {
        multiRoll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        game.score();
    }
    @Test
    void canScoreWithOnes() {
        multiRoll(1,1, 1,1, 1,1, 1,1, 1,1,1,1, 1,1, 1,1, 1,1, 1,1);
        assertThat(game.score()).isEqualTo(20);
    }
    @Test
    void scoreWithSpare() {
        multiRoll(5,5, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        assertThat(game.score()).isEqualTo(19);
    }
}
