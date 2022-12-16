public class Level1 {
    public static boolean MisterRobot(int n, int[] data) {
        int[] sortedData = new int[n];

        System.arraycopy(data, 0, sortedData, 0, n);

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (sortedData[i] < sortedData[i + 1] && sortedData[i + 1] < sortedData[i + 2]) {
                        break;
                    }

                    int x = sortedData[i];
                    sortedData[i] = sortedData[i + 1];
                    sortedData[i + 1] = sortedData[i + 2];
                    sortedData[i + 2] = x;

                    if (j > 1) return false;
                }
            }
        }

        return true;
    }
}
