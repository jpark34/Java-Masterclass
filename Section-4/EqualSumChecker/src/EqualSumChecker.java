public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int result) {
        int answer = num1 + num2;

        if (answer == result) {
            return true;
        }
         return false;
    }
}
