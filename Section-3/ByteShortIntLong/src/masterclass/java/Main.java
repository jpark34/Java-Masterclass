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

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + minByteValue);
        System.out.println("Byte Maximum Value = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + minShortValue);
        System.out.println("Short Maximum Value = " + maxShortValue);
        
        long longValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + minLongValue);
        System.out.println("Long Maximum Value = " + maxLongValue);

        int total = (minIntValue / 2);
        byte newByteValue = (byte) (minByteValue / 2);
        short newShortValue = (short) (minShortValue / 2);
    }
}
