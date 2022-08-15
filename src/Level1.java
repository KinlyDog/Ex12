public class Level1 {
    public static boolean MisterRobot(int n, int[] data) {
        int[] ma = new int[n];

        for (int i = 0; i < n; i++) {
            ma[i] = data[i];
        }

        boolean flag = false;

        while (!flag) {
            flag = true;

            for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (ma[i] < ma[i + 1] && ma[i + 1] < ma[i + 2]) {
                        break;
                    }

                    int x = ma[i];
                    ma[i] = ma[i + 1];
                    ma[i + 1] = ma[i + 2];
                    ma[i + 2] = x;

                    if (j == 2) return false;
                }
            }
        }

        return flag;
    }
}
