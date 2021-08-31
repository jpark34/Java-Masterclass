package masterclass.java;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + minIntValue);
        System.out.println("Integer Maximum Value = " + maxIntValue);
        System.out.println("Busted Max Value = " + (maxIntValue + 1));
        System.out.println("Busted Min Value = " + (minIntValue - 1));

        int maxIntTest = 2147483647;
    }
}
