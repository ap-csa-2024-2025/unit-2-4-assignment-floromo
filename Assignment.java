public class Assignment {
    public static void main(String[] args){
        System.out.println(LastFirstN("cream", "butter", 3));
        stringManip("hello", "world");
    }

    public static String LastFirstN(String s1, String s2, int n){
        return s1.substring((s1.length() - n), s1.length()).concat(s2.substring(0,n));
    }

    public static void stringManip(String s1, String s2){
System.out.println(s1.toUpperCase() + " " + ((s2.substring(0,1)).toUpperCase()).concat(s2.substring(1, s2.length())));
    }
}