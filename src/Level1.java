public class Level1 {
    public static boolean MisterRobot(int n, int[] data) {
        long start = System.currentTimeMillis();
        int[] ma = new int[n];

        for (int i = 0; i < n; i++) {
            ma[i] = data[i];
        }

        boolean flag = false;

        while (!flag) {
            flag = true;

            for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < 3; j++) {
                    if (ma[0 + i] < ma[1 + i] && ma[1 + i] < ma[2 + i]) {
                        break;
                    }

                    int x = ma[0 + i];
                    ma[0 + i] = ma[1 + i];
                    ma[1 + i] = ma[2 + i];
                    ma[2 + i] = x;

                    flag = false;
                }
            }

            long finish = System.currentTimeMillis();
            long dif = finish - start;

            if (dif > 1000) return false;
        }

        return flag;
    }
}
