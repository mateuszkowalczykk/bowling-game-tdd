import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class GameTest {
    Game game;

    @BeforeEach
    void setUp(){
        game = new Game();
    }

    @Test
    void canRoll() {
        game.roll(0);
    }
}
