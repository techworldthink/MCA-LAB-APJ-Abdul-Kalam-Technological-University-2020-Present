public class string_compare {
    public static void main(String[] args){
        String a = "ab";
        String b = "ad";
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(a.compareTo(a));
        String A = "A";
        System.out.println(a.compareTo(A));

        System.out.println(a.equals(A));
        System.out.println(a.equals(a));

        System.out.println(a==b);
    }
}
