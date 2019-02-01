import java.util.Arrays;
import java.util.Random;

class Main {

    public static void main(String[] args) {

        ArraysChanger arraysChanger = new ArraysChanger();

        int[] a = {1,2,3,4,5,6}; //test
        System.out.println(Arrays.toString(arraysChanger.giveNewArray(a)));

        int[] b = {0}; //test
        System.out.println(Arrays.toString(arraysChanger.giveNewArray(b)));

        int[] c = {3, 3, -3, 4, 4, 5}; //test
        System.out.println(Arrays.toString(arraysChanger.giveNewArray(c)));

        Random rand = new Random();
        int[] d = new int[rand.nextInt(10)]; //test dla losowej tablicy
        for (int i = 0; i < d.length; i++) {
            d[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arraysChanger.giveNewArray(d)));

    }

}