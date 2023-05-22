package LeetCode.String;

import java.util.Locale;

public class CountVowels {

    public static void main(String[] args) {
        System.out.println(vowelStrings(new String[]{"are","amy","u"},0,2));

    }

    public static int vowelStrings(String[] words, int left, int right) {

        int count = 0;
        for(int i=left; i<=right; i++){

            char s = words[i].toLowerCase().charAt(0);
            char h = words[i].toLowerCase().charAt(words[i].length() - 1);

            if((s == 'a' || s == 'e' || s == 'i' || s == 'o' ||s == 'u' )
            && ( h == 'a' || h == 'e' || h == 'i' || h == 'o' ||h == 'u' )){
                count = count+1;
            }

        }

        return count;
    }

}
