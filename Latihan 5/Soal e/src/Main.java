public class Main {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int element : array) {
            boolean digitDitemukan = false;
            int num = element;

            while (num > 0) {
                int digit = num % 10;
                if (digit == 2) {
                    digitDitemukan = true;
                    break;
                }
                num /= 10;
            }

            if (digitDitemukan) {
                System.out.println("angka angka dengan angka 2 didalamnya: "+element);
            }
        }
    }
}