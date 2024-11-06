package Task9.Problem2;

public class PairMain {
    public static void main(String[] args) {
        Pair<Integer, String> pair1=new Pair<>();
        Pair<Double, Integer> pair2=new Pair<>();

//        pair1.setFirst(9);
//        pair1.setSecond("nine");
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        pair2.setSecond(4);
        pair2.setFirst(5.5);
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());

        System.out.println(pair1.toString());
        System.out.println(pair2.toString());

    }
}
