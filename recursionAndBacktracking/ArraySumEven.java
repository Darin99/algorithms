package recursionAndBacktracking;

public class ArraySumEven {
    public static void main(String[] args) {

        System.out.println(arraySumEven(new int[]{2, 4, 6}, 0, 0));

    }

    public static int arraySumEven(int[] numbers, int index, int sum) {

        if (index >= numbers.length) {
            return sum;
        }

        if (numbers[index] % 2 == 0) {
            sum += numbers[index];
        }

        return arraySumEven(numbers, index + 1, sum);
    }
}