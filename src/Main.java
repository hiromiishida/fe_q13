public class Main {
    public static void main(String[] args) {
        System.out.println(max(new int[]{521, 1001, 54, 3, 9899}));
    }

    private static int max(int[] data) {
        int result = -1;

        for (int i = 1; i <= data.length - 1; i++) {
            if (result <= data[i]) {
                result = data[i];
            }
        }

        return result;
    }
}