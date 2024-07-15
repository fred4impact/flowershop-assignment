package org.flowershop;

import java.util.Scanner;

public class FlowerShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    orderDetailsAndPriceCalculation(scanner);
                    break;
                case 2:
                    summaryStatistics();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please select 1, 2, or 3.");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("Flower shop menu");
        System.out.println("1. Order bouquet and get the price.");
        System.out.println("2. Display statistics");
        System.out.println("3. Exit");
    }

    public static void orderDetailsAndPriceCalculation(Scanner scanner) {
        // Define mark-up values
        double[] sizeMarkUp = {5.5, 7.5, 9.5};
        double[] flowerMarkUp = {1.2, 1.3, 1.0, 1.0, 1.1, 1.1, 0.8};
        double[] colorMarkUp = {1.3, 1.2, 1.1, 1.1, 1.2, 1.0};

        // Get user input for size
        System.out.println("Select size (1: Small, 2: Medium, 3: Large): ");
        int sizeChoice = scanner.nextInt();
        while (sizeChoice < 1 || sizeChoice > 3) {
            System.out.println("Invalid choice. Select size (1: Small, 2: Medium, 3: Large): ");
            sizeChoice = scanner.nextInt();
        }
        double sizePrice = sizeMarkUp[sizeChoice - 1];

        // Get user input for flower
        System.out.println("Select flower (1: Rose, 2: Lily, 3: Carnations, 4: Daffodil, 5: Gerbera, 6: Chrysanthemum, 7: Assorted): ");
        int flowerChoice = scanner.nextInt();
        while (flowerChoice < 1 || flowerChoice > 7) {
            System.out.println("Invalid choice. Select flower (1: Rose, 2: Lily, 3: Carnations, 4: Daffodil, 5: Gerbera, 6: Chrysanthemum, 7: Assorted): ");
            flowerChoice = scanner.nextInt();
        }
        double flowerPrice = flowerMarkUp[flowerChoice - 1];

        // Get user input for color
        System.out.println("Select color (1: White, 2: Red, 3: Pink, 4: Yellow, 5: Blue, 6: Mixed): ");
        int colorChoice = scanner.nextInt();
        while (colorChoice < 1 || colorChoice > 6) {
            System.out.println("Invalid choice. Select color (1: White, 2: Red, 3: Pink, 4: Yellow, 5: Blue, 6: Mixed): ");
            colorChoice = scanner.nextInt();
        }
        double colorPrice = colorMarkUp[colorChoice - 1];

        // Calculate total price
        double totalPrice = (flowerPrice + colorPrice) * sizePrice;
        System.out.println("The price of the bouquet is: " + totalPrice);
    }

    public static void summaryStatistics() {
        // Sample data from the provided scenario
        String[] sizes = {"Medium", "Large", "Small", "Medium", "Large"};
        String[] flowers = {"Rose", "Assorted", "Gerbera", "Lily", "Rose"};
        String[] colors = {"Pink", "Assorted", "Yellow", "White", "Red"};
        double[] prices = {17.25, 17.1, 12.1, 19.5, 22.8};

        // Frequency counts
        int[] sizeCount = new int[3];
        int[] flowerCount = new int[7];
        int[] colorCount = new int[6];

        // Calculate frequency counts
        for (String size : sizes) {
            switch (size) {
                case "Small":
                    sizeCount[0]++;
                    break;
                case "Medium":
                    sizeCount[1]++;
                    break;
                case "Large":
                    sizeCount[2]++;
                    break;
            }
        }

        for (String flower : flowers) {
            switch (flower) {
                case "Rose":
                    flowerCount[0]++;
                    break;
                case "Lily":
                    flowerCount[1]++;
                    break;
                case "Carnations":
                    flowerCount[2]++;
                    break;
                case "Daffodil":
                    flowerCount[3]++;
                    break;
                case "Gerbera":
                    flowerCount[4]++;
                    break;
                case "Chrysanthemum":
                    flowerCount[5]++;
                    break;
                case "Assorted":
                    flowerCount[6]++;
                    break;
            }
        }

        for (String color : colors) {
            switch (color) {
                case "White":
                    colorCount[0]++;
                    break;
                case "Red":
                    colorCount[1]++;
                    break;
                case "Pink":
                    colorCount[2]++;
                    break;
                case "Yellow":
                    colorCount[3]++;
                    break;
                case "Blue":
                    colorCount[4]++;
                    break;
                case "Assorted":
                    colorCount[5]++;
                    break;
            }
        }

        // Calculate price statistics
        double minPrice = prices[0];
        double maxPrice = prices[0];
        double totalPrice = 0.0;
        for (double price : prices) {
            if (price < minPrice) minPrice = price;
            if (price > maxPrice) maxPrice = price;
            totalPrice += price;
        }
        double rangePrice = maxPrice - minPrice;
        double averagePrice = totalPrice / prices.length;

        // Display statistics
        System.out.println("Size\tSmall\tMedium\tLarge");
        System.out.println("Freq count\t" + sizeCount[0] + "\t" + sizeCount[1] + "\t" + sizeCount[2]);

        System.out.println("Flower\tRose\tLily\tCarnation\tDaffodil\tGerbera\tChrysanthemum\tAssorted");
        System.out.println("Freq count\t" + flowerCount[0] + "\t" + flowerCount[1] + "\t" + flowerCount[2] + "\t\t" +
                flowerCount[3] + "\t\t" + flowerCount[4] + "\t\t" + flowerCount[5] + "\t\t" + flowerCount[6]);

        System.out.println("Colour\tWhite\tRed\tPink\tYellow\tBlue\tMixed");
        System.out.println("Freq count\t" + colorCount[0] + "\t" + colorCount[1] + "\t" + colorCount[2] + "\t" +
                colorCount[3] + "\t" + colorCount[4] + "\t" + colorCount[5]);

        System.out.println("Statistics\tMinimum\tMaximum\tRange\tTotal number of\tTotal price\tAverage price");
        System.out.println("Price\t" + minPrice + "\t" + maxPrice + "\t" + rangePrice + "\t" + prices.length + "\t\t" + totalPrice + "\t" + averagePrice);
    }
}
