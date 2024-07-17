package org.flowershop;

import org.flowershop.Bouquet;
import org.flowershop.Colour;
import org.flowershop.Flower;

import java.util.ArrayList;
import java.util.Scanner;

class FlowerShop {
    private final ArrayList<Bouquet> bouquets;

    public FlowerShop() {
        bouquets = new ArrayList<>();
    }

    public void orderBouquet() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Size (1: Small, 2: Medium, 3: Large): ");
        int sizeChoice = scanner.nextInt();
        double sizeMarkup = 0;
        switch (sizeChoice) {
            case 1: sizeMarkup = Size.SMALL; break;
            case 2: sizeMarkup = Size.MEDIUM; break;
            case 3: sizeMarkup = Size.LARGE; break;
            default: System.out.println("Invalid choice."); return;
        }

        System.out.println("Choose Flower (1: Rose, 2: Lily, 3: Carnation, 4: Daffodil, 5: Gerbera, 6: Chrysanthemum, 7: Assorted): ");
        int flowerChoice = scanner.nextInt();
        double flowerMarkup = 0;
        switch (flowerChoice) {
            case 1: flowerMarkup = Flower.ROSE; break;
            case 2: flowerMarkup = Flower.LILY; break;
            case 3: flowerMarkup = Flower.CARNATION; break;
            case 4: flowerMarkup = Flower.DAFFODIL; break;
            case 5: flowerMarkup = Flower.GERBERA; break;
            case 6: flowerMarkup = Flower.CHRYSANTHEMUM; break;
            case 7: flowerMarkup = Flower.ASSORTED; break;
            default: System.out.println("Invalid choice."); return;
        }

        System.out.println("Choose Colour (1: White, 2: Red, 3: Pink, 4: Yellow, 5: Blue, 6: Assorted): ");
        int colourChoice = scanner.nextInt();
        double colourMarkup = 0;
        switch (colourChoice) {
            case 1: colourMarkup = Colour.WHITE; break;
            case 2: colourMarkup = Colour.RED; break;
            case 3: colourMarkup = Colour.PINK; break;
            case 4: colourMarkup = Colour.YELLOW; break;
            case 5: colourMarkup = Colour.BLUE; break;
            case 6: colourMarkup = Colour.ASSORTED; break;
            default: System.out.println("Invalid choice."); return;
        }

        Bouquet bouquet = new Bouquet(sizeMarkup, flowerMarkup, colourMarkup);
        bouquets.add(bouquet);
        System.out.println("Bouquet ordered. Price: " + bouquet.getPrice());
    }

    public void displayStatistics() {
        int smallCount = 0, mediumCount = 0, largeCount = 0;
        int roseCount = 0, lilyCount = 0, carnationCount = 0, daffodilCount = 0, gerberaCount = 0, chrysanthemumCount = 0, assortedCount = 0;
        int whiteCount = 0, redCount = 0, pinkCount = 0, yellowCount = 0, blueCount = 0, mixedCount = 0;
        double total = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        for (Bouquet bouquet : bouquets) {
            double price = bouquet.getPrice();
            total += price;
            if (price < min) min = price;
            if (price > max) max = price;
        }

        int count = bouquets.size();
        double avg = count > 0 ? total / count : 0;

        System.out.println("Statistics:");
        System.out.println("Small: " + smallCount + ", Medium: " + mediumCount + ", Large: " + largeCount);
        System.out.println("Rose: " + roseCount + ", Lily: " + lilyCount + ", Carnation: " + carnationCount + ", Daffodil: " + daffodilCount + ", Gerbera: " + gerberaCount + ", Chrysanthemum: " + chrysanthemumCount + ", Assorted: " + assortedCount);
        System.out.println("White: " + whiteCount + ", Red: " + redCount + ", Pink: " + pinkCount + ", Yellow: " + yellowCount + ", Blue: " + blueCount + ", Mixed: " + mixedCount);
        System.out.println("Minimum Price: " + min + ", Maximum Price: " + max + ", Range: " + (max - min) + ", Total Bouquets: " + count + ", Total Price: " + total + ", Average Price: " + avg);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Flower shop menu\n1. Order bouquet and get the price.\n2. Display statistics\n3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: orderBouquet(); break;
                case 2: displayStatistics(); break;
                case 3: System.exit(0);
                default: System.out.println("Invalid choice.");
            }
        }
    }

    public static void main(String[] args) {
        FlowerShop shop = new FlowerShop();
        shop.run();
    }
}
