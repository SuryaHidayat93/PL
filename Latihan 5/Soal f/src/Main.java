public class Main {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 1; i <= array.length - 2; i++) {
            if (array[i] % 2 != 0 && array[i-1] % 2 == 0 && array[i+1] % 2 == 0) {
                System.out.println("Angka-angka ganjil diapit oleh angka genap dalam array:"+array[i]);
            }
        }
    }
}