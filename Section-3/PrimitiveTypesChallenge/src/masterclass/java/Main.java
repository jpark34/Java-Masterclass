package masterclass.java;

public class Main {

    public static void main(String[] args) {

        byte challengeByte = 100;
        short challengeShort = 2000;
        int challengeInt = 300000;
        long challengeLong = 50000L + 10L * (challengeByte + challengeShort + challengeInt);

        System.out.println("challengeLong = " + challengeLong);

        short total = (short) (1000 + 10 * (challengeByte + challengeShort + challengeInt));

        System.out.println("shot total = " + total);
    }
}
