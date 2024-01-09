import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import basics.Help;

public class StringManipulation {
    public static void main(String[] args) {
        new StringManipulation().longestSubstringWoutRepeatation();
    }
    // 4.1 a program to reverse a  string without using any built-in function.
    void reverseStringWoutBuiltIn(){
        Help.begin();
        System.out.println("program to reverse a string without using any built-in function");
        Help.printLine();
        System.out.println("Enter a String to reverse");
        String input = Help.in.nextLine();
        char[] inChar = input.toCharArray();
        System.out.println("Output: ");
        for (int i = inChar.length-1; i >= 0; i--) {
            System.out.print(inChar[i]);
        }
        System.out.println();
        Help.end();
    }
    // 4.2 a program to find the length of the longest substring without repeating characters in a given string.
    void longestSubstringWoutRepeatation(){
        String str = "abbac";
        char[] charr= str.toCharArray();
        String lSbStr=null;
        int lSbStrLen =0;
        Map<Character , Integer> hMap = new LinkedHashMap<>();
        for (int i = 0; i < charr.length; i++) {
            char c =charr[i];
            if (!hMap.containsKey(c)) {
                hMap.put(c, i);
            } else{
                i = hMap.get(c);
                hMap.clear();
            }

            if (hMap.size() > lSbStrLen) {
                lSbStrLen = hMap.size();
                lSbStr = hMap.keySet().toString();
            }
        }
        System.out.println("longest SubString in "+ str+" is "+ lSbStr);
    }
    // 4.3  a program to count the number of words in a given string.
    void countWords(){
         Help.begin();
        System.out.println("Program to count the number of words in a given string");
        Help.printLine();
        System.out.println("Enter a String to count number of words :");
        String str= Help.in.nextLine();
        int count = 0;
        boolean isWord = false;
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (!isWord) {
                    count++;
                     isWord = true;
                }
            } else isWord = false;
        }
        System.out.println( count );
    }
    // 4.4 program to find the most frequent character in a given string.
    void frequentCharacters(){
          String str = "aasgsmnnms";
            Map< Character , Integer > hmap = new HashMap<>();
            for ( char c : str.toCharArray()) {
                hmap.put(c, hmap.getOrDefault(c, 0)+1);
            }
            char mostfreq ='\0';
            int max=0;
            for ( Entry<Character, Integer> chk : hmap.entrySet()) {
                if (chk.getValue() > max) {
                    max = chk.getValue();
                    mostfreq = chk.getKey();
                }
            }
            System.out.println("Most frquented Character in "+ str + " is :"+ mostfreq);
    }
    // 4.5  program to check if two given strings are anagrams or not.
     void anagram(){
         Help.begin();
        System.out.println("program to find the Strings are anagram or not");
        Help.printLine();
        System.out.println("Enter 1st word ");
        String str1=Help.in.nextLine();
        System.out.println("Enter 2nd word");
        String str2= Help.in.nextLine();
        boolean isAnagram= true;
        if (str1.length() != str2.length()) { isAnagram =false;}
        else{
            char[] s1ch = str1.toLowerCase().toCharArray();
            char[] s2ch = str2.toLowerCase().toCharArray();
            Arrays.sort(s1ch);
            Arrays.sort(s2ch);
             isAnagram = Arrays.equals(s1ch, s2ch);
        }
        if (isAnagram) {System.out.println("These Words "+str1 +" and "+ str2 + " are Anagram");}
        else{
            System.out.println("These Words "+str1 +" and "+ str2 + " are not an Anagram");}

     }
     // 4.6 program to remove all the white spaces from a given string.
      void removeWhiteSpaces(){
        Help.begin();
        System.out.println(" Program to remove all the white spaces from a given string.");
        Help.printLine();
        System.out.println("Enter a String to remove the White spaces  :");
        String str = Help.in.nextLine();
        char[] chs= str.toCharArray();
        char[] res= new char[chs.length];
        int ri=0;
        for (int i = 0; i < chs.length; i++) {
             if (chs[i]!=' ') {
                res[ri++]=chs[i];
             }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }

      }

      
      // 4. 7 program to capitalize the first letter of each word in a given string.
       void capitalizeFirstLetters(){
        Help.begin();
        System.out.println("Program to capitalize the first letter of each word in a given string");
        Help.printLine();
        System.out.println("Enter a multi Word Sentence to capitalize");
        String str = Help.in.nextLine();
       // StringBuilder sb= new StringBuilder(str);
       char[] sch=str.toCharArray(); 
       for (int i = 0; i < sch.length; i++) {
        if (i == 0) {
            if ((sch[i] >= 'a' && sch[i] <= 'z') || (sch[i] >= 'A' && sch[i] <= 'Z')) {
                sch[i]=Character.toUpperCase(sch[i]);
            }
        }
        else if (sch[i-1]==' ') {
            if ((sch[i] >= 'a' && sch[i] <= 'z') || (sch[i] >= 'A' && sch[i] <= 'Z')) {
                sch[i]=Character.toUpperCase(sch[i]);
            }
        }
       }
       String res= String.valueOf(sch);
       System.out.println(res);
       }
    // 4.8  a program to find the first non-repeated character in a given string.
        void firstNonRepeatedChar(){
            String str = "aasgsmnnm";
            Map< Character , Integer > hmap = new HashMap<>();
            for ( char c : str.toCharArray()) {
                hmap.put(c, hmap.getOrDefault(c, 0)+1);
            }
            char res=' ';
            for ( char c : str.toCharArray()) {
                if (hmap.get(c)== 1) {
                    res =c;
                    break;
                }
            }
            System.out.println("First Non Repeating Character of "+str +" is:"+ res);

        }   
}
