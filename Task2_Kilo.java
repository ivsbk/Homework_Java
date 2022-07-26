public class Task2_Kilo {
    public static void main (String[] args){
        final int startNumber = 1000;
        final int endNumber = 1;
        final int step = -2;
        int i;

        for (i=startNumber; i>=endNumber; i=i+step){
            System.out.println(i);
        }
        if (i != 1) System.out.println(1);
    }
}
