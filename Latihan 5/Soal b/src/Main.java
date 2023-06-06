import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        boolean found = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Angka ditemukan dalam array");
        } else {
            System.out.println("Angka tidak ditemukan dalam array");
        }
    }
}