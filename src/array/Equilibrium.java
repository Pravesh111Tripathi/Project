package array;

public class Equilibrium {
    public void equilibrium(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < i; j++) {
                left = left + array[j];
            }
            for (int j = i + 1; j < array.length; j++) {
                right = right + array[j];
            }
            if (left == right) {
                count++;
            }
        }
        System.out.println(count);
    }
}
