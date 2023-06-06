public class Main {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int sum = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int selisih = array[i] - array[i+1];
            System.out.println(selisih);
            sum += selisih;
        }

        System.out.println("Jumlah angka-angka selisih: " + sum);
    }
}