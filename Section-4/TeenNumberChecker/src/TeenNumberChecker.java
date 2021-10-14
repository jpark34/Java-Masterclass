public class TeenNumberChecker {
    // return true if one of the 3 parameters are a teen number
    public static boolean hasTeen(int num1, int num2, int num3) {
        if ( (num1 > 12) && (num1 < 20) ) {
            return true;
        }
        if ( (num2 > 12) && (num2 < 20) ) {
            return true;
        }
        if ( (num3 > 12) && (num3 < 20) ) {
            return true;
        }

        return false;
    }

    // return true if the parameter is a teen number
    public static boolean isTeen(int number) {
        if ( (number > 12) && (number < 20) ) {
            return true;
        }

        return false;
    }
}
