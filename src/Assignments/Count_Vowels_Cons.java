package Assignments;

import java.util.Scanner;

public class Count_Vowels_Cons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to know how may consonants and vowels are in it");
        String word = sc.next();

        word = word.toLowerCase();

        int vowels = 0;
        int cons = 0;

        for (int i = 0; i < word.length() ; i++) {
            char ch = word.charAt(i);
            if(ch == 'a'|| ch == 'e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else if (ch>='a' && ch<='z'){
                cons++;
            }

        }
        System.out.println("vowels" + " "+vowels );
        System.out.println("consonants"+" " + cons);
    }
}
