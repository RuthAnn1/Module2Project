import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RandomNumberTest {
    private RandomNumber randomNumber;

    @BeforeEach
    void setUp() {
        randomNumber = new RandomNumber();
    }

    @Test
    void testGuessCorrectNumber() {
        int correctNumber = randomNumber.getCorrectNumber();
        String result = randomNumber.checkGuess(correctNumber);
        assertEquals("Yay you won!!!!", result);
    }

    @Test
    void testGuessTooLow() {
        int correctNumber = randomNumber.getCorrectNumber();
        int userGuess = correctNumber - 1;
        String result = randomNumber.checkGuess(userGuess);
        assertEquals("Oh no!!! Your guess is too low. Guess a higher number", result);
    }

    @Test
    void testGuessTooHigh() {
        int correctNumber = randomNumber.getCorrectNumber();
        int userGuess = correctNumber + 1;
        String result = randomNumber.checkGuess(userGuess);
        assertEquals("Uh oh! Your number is too high. Guess a lower number", result);
    }
}
