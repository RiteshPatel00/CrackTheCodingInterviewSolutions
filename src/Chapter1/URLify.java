package Chapter1;

public class URLify {

    public static void main(String[] args) {


        System.out.println(convert("        H el l o " ));


    }


    static String convert(String str){
        return str.trim().replaceAll("\\s", "%20");
    }


}
