package array;

public class FindAllMax2 {
    public void findAllMax2(int[] array) {
        int count = 1;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                count = 1;
            } else if (array[i] == max) {
                count++;

            }
        }

        System.out.println(array.length - count);
    }
}
