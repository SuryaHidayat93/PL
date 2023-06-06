public class Main {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};


        for (int element : array) {
            if (element % 2 != 0) {
                System.out.println("angka-angka ganjil: "+element);
            }
        }
    }
}