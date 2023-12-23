package array;

public class CarryForward {
    public void carryForward(char[] array) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                count++;

            } else if (array[i] == 'z') {

                ans = ans + count;
            }
        }
        System.out.println(ans);
    }
}
