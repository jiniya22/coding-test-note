package complexity;

public class FrogJmpExample {
    public static void main(String[] args) {
//        System.out.println(flogJmp(10, 85, 30));
//        System.out.println(flogJmp(1, 10, 30));
        System.out.println(flogJmp(1, 1, 30));
    }


    static int flogJmp(int X, int Y, int D) {
        double den = (Y - X) * 1.0;
        if(den == 0)
            return 0;
        if(den <= D) {
            return 1;
        }
        return (int)Math.ceil(den/D);
    }
}
