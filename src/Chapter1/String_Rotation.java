package Chapter1;

public class String_Rotation {

    public static void main(String[] args) {
        String a = "Hello";
        String b = "lloHe";
        System.out.println(stringRotation(a,b));
    }


    static boolean stringRotation(String a, String b){
        return (a.length() == b.length() && (a+a).contains(b));
    }
}
