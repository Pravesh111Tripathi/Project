package array;

public class BootForce {
    public void bootForce(char[] array) {
        int ans = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'a') {
                for (int j = i + 1; j < array.length; j++) {

                    if (array[j] == 'z') {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
