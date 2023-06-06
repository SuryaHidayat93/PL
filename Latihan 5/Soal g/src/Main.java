public class Main {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 1; i < array.length; i++) {
            if (array[i] % 5 == 0 && array[i-1] % 5 == 0) {
                System.out.println("Angka-angka kelipatan 5 yang sebelumnya juga angka kelipatan 5 dalam array:"+array[i]);
            }
        }
    }
}