package Chapter1;

public class Palindrome_Permutation {

    public static void main(String[] args) {

        //Does not handle spaces
        //only accepts alphabet from a - z
        System.out.println(isPalindromePermutation("HeLLoehl"));


    }


    static boolean isPalindromePermutation(String str){
        int[] table = buildCharOccurrenceTable(str.toLowerCase());
        return checkForOdd(table);
    }

    //Since palindromes can only have one char that appears an odd number of times
    //I check to see if that char is found, and that it only occurs once
    static boolean checkForOdd(int[] table){
        boolean oddFound = false;

        for(int freq : table){
            if(freq % 2 == 1){
                if(oddFound) return false;

                else oddFound = true;
            }
        }
        return true;
    }


    //Count how many times each character appears
    static int[] buildCharOccurrenceTable(String str){
        int[] table = new int[26];
        for(char c : str.toCharArray()){
            if(getCharIndex(c) != -1){
                table[getCharIndex(c)]++;
            }
        }
        return table;
    }


    //Finds the index at where our character could be
    static int getCharIndex(char c){
        int a = 'a';
        int z = 'z';
        int val = c;

        if(a <= val && val<= z){
            return val - a;
        }

        else return -1;
    }




}
