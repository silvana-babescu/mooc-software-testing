package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void mirrorBeginningEnd(){
    String actualResult = new Mirror().mirrorEnds("xvocvx");
        Assertions.assertEquals("xv",actualResult);
    }
    @Test
    public void wholeMirror(){
        String actualResult = new Mirror().mirrorEnds("xvovx");
        Assertions.assertEquals("xvo",actualResult);
    }
    @Test
    public void oneCharMirror(){
        String actualResult = new Mirror().mirrorEnds("xocx");
        Assertions.assertEquals("x",actualResult);
    }
    @Test
    public void noMirror(){
        String actualResult = new Mirror().mirrorEnds("abcd");
        Assertions.assertEquals("No mirror!",actualResult);
    }


}


