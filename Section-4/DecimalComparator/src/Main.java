public class Main {
    public static void main(String[] args) {
        boolean answer = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175); // should return true
        System.out.println(answer);
        answer = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(answer);
        answer = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(answer);
        answer = DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(answer);
    }
}
