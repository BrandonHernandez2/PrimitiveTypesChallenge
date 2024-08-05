public class Assignment1 {
    public static void main(String[] args) {

        byte myByte = 9;

        short myShort = 127;

        int myInt = 32;

        long myLong = 80000 - (5 * (myInt + myShort + myByte));
        System.out.println(myLong);
    }
}
