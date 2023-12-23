package array;

public class FindAllMax {
    public void findAllMax(int[] array) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != max) {
                count++;
            }
        }
        System.out.println("total elements in array = " + array.length);
        System.out.println(max + " is max");
        System.out.println(count + " values are not max");
    }
}
