public class Main {
    public static void main(String[] args) {
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i+1]) {
                System.out.println("angka angka yang setelahnya nilainya lebih bsar: "+array[i]);
            }
        }
    }
}