package Chapter1;


import java.util.Arrays;

public class Check_Permutation {

    public static void main(String[] args) {

        System.out.println(checkPermutation("god ", "do g"));
        System.out.println(checkPermutation("god", "do g"));


    }


    static boolean checkPermutation(String a, String b){
        if(a.length() != b.length()) return false;

        return sort(a).equals(sort(b));

    }

    static String sort(String str){
        char[] arr = str.toCharArray();

        //Cannot assign a variable as this is void and will change
        //the arr in place
        //char[] arr_sorted = Arrays.sort(arr);

        Arrays.sort(arr);

        return new String(arr);
    }





}
