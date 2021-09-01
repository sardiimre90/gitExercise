import java.util.Random;

public class Main {

    static int[] array = new int[20];


    public static void main(String[] args) {

        fillArray();
        System.out.println("----------------");
        min();
        System.out.println("----------------");
        even();

        }

    public static int[] fillArray() {
    for (int i = 0; i < array.length; i++) {
        array[i] = (int) (Math.random() * 100);
        System.out.println(array[i] + ", ");
    }
        return array;
    }
    public static int min() {

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                 }
             }
        System.out.println("A legkisebb: " +min);
        return min;
        }

    public static int even () {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Páros számok: " + count);
        return count;


    }
}
