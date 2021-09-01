import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[20];

        for(int i = 0; i <  array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + ", ");
        }
    }
}
