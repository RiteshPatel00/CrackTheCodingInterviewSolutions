package Chapter1;

public class One_Away {

    public static void main(String[] args) {

        System.out.println(oneAway("pale","bake"));




    }



    static boolean oneAway(String a, String b){
        if (a.equals(b)) return true;
        else if (!(a.length() - b.length() <= 1)) return false;
        else if(a.length() == b.length()) return checkForReplace(a,b);
        else if (a.length() > b.length()) return checkForEdit(b, a);
        else return checkForEdit(a,b);
    }



    static boolean checkForReplace(String a, String b){
        boolean foundReplace = false;

        for (int i = 0; i < a.length() ; i ++){
            if (a.charAt(i) != b.charAt(i)){
                if (foundReplace) return false;
                else foundReplace = true;
            }
        }
        return true;
    }


    static boolean checkForEdit(String first, String second){
        int first_index = 0;
        int second_index = 0;

        while (first_index < first.length() && second_index < second.length()) {

            if (first.charAt(first_index) != second.charAt(second_index)) {
                if (first_index != second_index) return false;
                else second_index++;
            }

            else {
                first_index++;
                second_index++;
            }

        }
        return true;
    }





}
