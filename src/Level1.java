public class Level1 {
    public static boolean MisterRobot(int n, int[] data) {
        int[] ma = new int[n];
        int[] tmp = new int[n];

        for (int i = 0; i < n; i++) {
            ma[i] = data[i];
        }

        for (int i = 0; i < n; i++) {
            if (ma[i] != i + 1) break;

            if (i == n - 1) return true;
        }

        boolean flag = false;

        while (!flag) {
            flag = true;

            for (int i = 0; i < n; i++) {
                tmp[i] = ma[i];
            }

            for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (ma[0 + i] < ma[1 + i] && ma[1 + i] < ma[2 + i]) {
                        break;
                    }

                    int x = ma[0 + i];
                    ma[0 + i] = ma[1 + i];
                    ma[1 + i] = ma[2 + i];
                    ma[2 + i] = x;
                }
            }

            for (int i = 0; i < n; i++) {
                if (ma[i] != i + 1) {
                    flag = false;
                    break;
                }

                if (i == n - 1) return true;
            }


            for (int i = 0; i < n; i++) {
                if (tmp[i] != ma[i]) {
                    break;
                }

                if (i == n - 1) {
                    return false;
                }
            }
        }

        return flag;
    }
}
