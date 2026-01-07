import java.util.Random;
import java.util.Scanner;

public class FootballTeamHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Generating random heights for 11 players...");

        int[] heights = generateHeights();

        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);

        scanner.close();
    }

    private static int[] generateHeights() {
        Random random = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }
        return heights;
    }

    private static int calculateSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    private static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }

    private static int findShortest(int[] heights) {
        int shortest = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    private static int findTallest(int[] heights) {
        int tallest = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}