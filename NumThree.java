public class NumThree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Четные элементы массива: ");
        for (int element : arr) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }

        System.out.println();
    }
}
