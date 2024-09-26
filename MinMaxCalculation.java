public class MinMaxCalculation {

    // Method to find the minimum and maximum values in an array
    public static int[] findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The array cannot be null or empty.");
        }

        int min = numbers[0];
        int max = numbers[0];

        // Iterate through the array to find min and max
        for (int num : numbers) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        return new int[] {min, max};
    }

    public static void main(String[] args) {
        // Example usage with an array
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        int[] minMax = findMinMax(numbers);
        System.out.println("Minimum: " + minMax[0]);
        System.out.println("Maximum: " + minMax[1]);
    }
}

