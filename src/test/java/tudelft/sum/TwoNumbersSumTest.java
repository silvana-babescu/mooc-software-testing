package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void happyPath(){
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(1,3));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(4,1,3));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(4,2,6));

        ArrayList<Integer> f = new TwoNumbersSum().addTwoNumbers(first,second);

        Assertions.assertEquals(expected,f);
    }
    @Test
    public void sameNumbers(){
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,4));

        ArrayList<Integer> f = new TwoNumbersSum().addTwoNumbers(first,second);

        Assertions.assertEquals(expected,f);
    }
    // this method tests if 0+0+0+0 = 0. test fails because current implementation returns result [0,0] so there is a bug when using 0,0,..0 in both strings
    // // or in one string and length of zero string is greater than length of non zero string
    @Test
    public void zeroNumbers(){
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(0,0));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(0,0));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(0));

        ArrayList<Integer> f = new TwoNumbersSum().addTwoNumbers(first,second);

        Assertions.assertEquals(expected,f);
    }
    @Test
    public void secondNumberZero(){
        ArrayList<Integer> first = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> second = new ArrayList<Integer>(Arrays.asList(0));
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,2));

        ArrayList<Integer> f = new TwoNumbersSum().addTwoNumbers(first,second);

        Assertions.assertEquals(expected,f);
    }



}
