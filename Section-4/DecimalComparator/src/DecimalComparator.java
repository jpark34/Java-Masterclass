public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int check1 = (int) (num1 * 1000); // move the decimals to check for up to 3 decimals
        int check2 = (int) (num2 * 1000); // move the decimals to check for up to 3 decimals

        if (check1 == check2) return true;

        return false;
    }
}
