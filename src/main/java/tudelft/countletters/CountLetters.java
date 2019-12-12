package tudelft.countletters;

public class CountLetters {

    public int count(String str) {
        int words = 0;
        char last = ' ';
        for(int i = 0; i < str.length(); i++)
        {
            if(!Character.isLetter(str.charAt(i)) && (last == 'r' || last == 's'))
            {
                words++;
            }

            last = str.charAt(i);
        }
//the bug was that it was char 'x' instead of char 'r'
        if(last == 'r' || last == 's')
            words++;

        return words;
    }

}