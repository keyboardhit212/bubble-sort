public class BubbleSort {

    public static void main(String[] args) {
        int[] digits = {121, 4, 34, 12, 11, 2, 1};
        System.out.print("Before Sorting: ");
        displayArray(digits);
        bubbleSort(digits);
        System.out.print("After Sorting: ");
        displayArray(digits);
    }

    public static void bubbleSort(int[] digits) {
        int unsorted_index = digits.length - 1;
        int moves = 0;
        int condition = 0;
        while (unsorted_index > 0) {
            for (int i = 0;  i < unsorted_index; i++) {
                if (digits[i] > digits[i+1]) {
                    int temp = digits[i];
                    digits[i] = digits[i+1];
                    digits[i+1] = temp;
                }
            }
            unsorted_index -= 1;
        }
    }

    public static void displayArray(int[] digits) {
        for (int digit : digits)
            System.out.printf("%d ", digit);
        System.out.println();
    }
}
