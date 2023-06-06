public class Main {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int A = 0;

        for (int i = 0; i < array.length; i++) {
            A = A + array[i];
        }

        System.out.println("Jumlah angka dalam array: " + A);
    };
    }
