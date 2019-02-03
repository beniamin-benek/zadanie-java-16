import java.util.Arrays;

class ArraysChanger {

    int[] giveNewArray(int[] array){
        int[] arrayCopy = Arrays.copyOf(array, array.length * 2);
        //tworzy nową tablicę o rozmiarze 2x większym od podanej tablicy,
        //która jest wypełniona elementami z podanej tablicy oraz wartościami 0 na reszcie pozycji
        for(int i = array.length; i <= arrayCopy.length - 1; i++)
            arrayCopy[i] = array[arrayCopy.length - 1 - i];

        return arrayCopy;
    }

    //DRUGI SPOSÓB
    void printNewArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < 2 * length; i++) {
            if (i <= length - 1)
                System.out.print(array[i] + " ");
            else
                System.out.print(array[2* length - i - 1] + " ");
        }
        System.out.println();
    }

}