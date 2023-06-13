package lesson02_test;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("GetSum = " + GetSum(1, 7));
        System.out.println("GetSUM = " + GetSum(2.5, 4.5));
        System.out.println("GetSUm = " + GetSum(1, 8.9));
        System.out.println("GetSum = " + GetSum("Masha", "Bear"));
    }

    public static Object GetSum(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        }
        return -1;
    }

}
