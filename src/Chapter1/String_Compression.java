package Chapter1;

public class String_Compression {

    public static void main(String[] args) {

        System.out.println(compress("aaabbcc"));


    }


    static String compress(String str){
        StringBuilder compressed = new StringBuilder();
        int counter = 0;

        for(int i = 0 ; i < str.length() ; i ++){
            counter++;

            if(i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(counter);
                counter = 0;
            }
        }

        if(compressed.toString().length() < str.length()) return compressed.toString();

        else return str;

    }


}
