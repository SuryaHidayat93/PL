public class Main {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum += array[j];
            }

            System.out.println("Jumlah angka hingga indeks " + i + " : " + sum);
        }
    }
}