package basic;

public class StringExample {
    public static void main(String[] args) {
        example1();
    }

    static void example1() {
        String s1 = "apple";
//        String s2 = "apple";
        System.out.println(System.identityHashCode(s1));
//        System.out.println(System.identityHashCode(s2));

        String s3 = new String("apple");
        String s4 = new String("apple");

        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

        String s5 = new String("apple").intern();
        System.out.println(System.identityHashCode(s5));
        String s6 = "apple";
        System.out.println(System.identityHashCode(s6));
    }
}
