import java.util.Arrays;
import java.util.Random;

class Main {

    public static void main(String[] args) {

        ArraysChanger arraysChanger = new ArraysChanger();

        int[] a = {1,2,3,4,5,6}; //test
        System.out.println(Arrays.toString(arraysChanger.giveNewArray(a))); //pierwsza metoda
        arraysChanger.printNewArray(a); //druga metoda

        int[] b = {0}; //test
        System.out.println(Arrays.toString(arraysChanger.giveNewArray(b))); //pierwsza metoda
        arraysChanger.printNewArray(b); //druga metoda

        int[] c = {3, 3, -3, 4, 4, 5}; //test
        System.out.println(Arrays.toString(arraysChanger.giveNewArray(c))); //pierwsza metoda
        arraysChanger.printNewArray(c); //druga metoda

        Random rand = new Random();
        int[] d = new int[rand.nextInt(10)]; //test dla losowej tablicy o losowym rozmiarze
        for (int i = 0; i < d.length; i++) {
            d[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(arraysChanger.giveNewArray(d))); //pierwsza metoda
        arraysChanger.printNewArray(d); //druga metoda

    }

}