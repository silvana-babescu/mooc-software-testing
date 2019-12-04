package tudelft.ghappy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class GHappyTest {
    @ParameterizedTest(name= "string={0}")
    @CsvSource({"xggxggx","ggx","xgg","gg","gggx"})
    @Test
    public void allGsAreHappy(String s){
        boolean isGHappy = new GHappy().gHappy(s);
        Assertions.assertTrue(isGHappy);
    }
    @ParameterizedTest(name= "string={0}")
    @CsvSource({"xgx","gx","bnxg","fgghgkggg"})
    @Test
    public void gsAreNotHappy(String s){
        boolean isGHappy = new GHappy().gHappy(s);
        Assertions.assertFalse(isGHappy);
    }
}
