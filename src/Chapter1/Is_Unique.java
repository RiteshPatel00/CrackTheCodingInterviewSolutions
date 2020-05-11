package Chapter1;

import java.sql.SQLOutput;

public class Is_Unique {

    public static void main(String[] args) {

        System.out.println(isUnique("Hhelo"));
        System.out.println(isUnique("A abc def B"));
        System.out.println(isUnique("Hold on"));


    }

    public static boolean isUnique(String str) {
        //Assuming 128 ASCII Table
        if (str.length() > 128) return false;


        //All values are initialized to be false by default
        boolean[] arr = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            //Grab ASCII value
            int val = str.charAt(i);

            if (arr[val] == true) return false;

            arr[val] = true;
        }

        //Return true indicating no duplicates
        return true;
    }




}


