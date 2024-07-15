package org.project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowerShopGUI extends JFrame {

    public FlowerShopGUI() {
        // Set up the frame
        setTitle("Flower Shop Menu");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create buttons
        JButton orderButton = new JButton("Order bouquet and get the price");
        JButton statsButton = new JButton("Display statistics");
        JButton exitButton = new JButton("Exit");

        // Set up layout
        setLayout(new GridLayout(3, 1));
        add(orderButton);
        add(statsButton);
        add(exitButton);

        // Add action listeners
        orderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orderDetailsAndPriceCalculation();
            }
        });

        statsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                summaryStatistics();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void orderDetailsAndPriceCalculation() {
        JOptionPane.showMessageDialog(this, "A bouquet has been ordered");
    }

    public void summaryStatistics() {
        // Sample data from Table 1
        String[] sizes = {"Medium", "Large", "Small", "Medium", "Large"};
        String[] flowers = {"Rose", "Assorted", "Gerbera", "Lily", "Rose"};
        String[] colors = {"Pink", "Assorted", "Yellow", "White", "Red"};
        double[] prices = {17.25, 17.10, 12.10, 19.50, 22.80};

        // Arrays to store counts
        int[] sizeCount = new int[3];
        int[] flowerCount = new int[7];
        int[] colorCount = new int[6];

        // Variables for statistics
        double minPrice = Double.MAX_VALUE;
        double maxPrice = Double.MIN_VALUE;
        double totalPrice = 0.0;

        // Processing each order
        for (int i = 0; i < sizes.length; i++) {
            // Counting sizes
            switch (sizes[i]) {
                case "Small": sizeCount[0]++; break;
                case "Medium": sizeCount[1]++; break;
                case "Large": sizeCount[2]++; break;
            }
            // Counting flowers
            switch (flowers[i]) {
                case "Rose": flowerCount[0]++; break;
                case "Lily": flowerCount[1]++; break;
                case "Carnations": flowerCount[2]++; break;
                case "Daffodil": flowerCount[3]++; break;
                case "Gerbera": flowerCount[4]++; break;
                case "Chrysanthemum": flowerCount[5]++; break;
                case "Assorted": flowerCount[6]++; break;
            }
            // Counting colors
            switch (colors[i]) {
                case "White": colorCount[0]++; break;
                case "Red": colorCount[1]++; break;
                case "Pink": colorCount[2]++; break;
                case "Yellow": colorCount[3]++; break;
                case "Blue": colorCount[4]++; break;
                case "Assorted": colorCount[5]++; break;
            }
            // Calculating statistics
            double price = prices[i];
            if (price < minPrice) minPrice = price;
            if (price > maxPrice) maxPrice = price;
            totalPrice += price;
        }

        double averagePrice = totalPrice / sizes.length;
        double priceRange = maxPrice - minPrice;

        // Creating the statistics message
        StringBuilder statsMessage = new StringBuilder();
        statsMessage.append("Size Count: Small=").append(sizeCount[0]).append(", Medium=").append(sizeCount[1]).append(", Large=").append(sizeCount[2]).append("\n");
        statsMessage.append("Flower Count: Rose=").append(flowerCount[0]).append(", Lily=").append(flowerCount[1]).append(", Carnations=").append(flowerCount[2]).append(", Daffodil=").append(flowerCount[3]).append(", Gerbera=").append(flowerCount[4]).append(", Chrysanthemum=").append(flowerCount[5]).append(", Assorted=").append(flowerCount[6]).append("\n");
        statsMessage.append("Color Count: White=").append(colorCount[0]).append(", Red=").append(colorCount[1]).append(", Pink=").append(colorCount[2]).append(", Yellow=").append(colorCount[3]).append(", Blue=").append(colorCount[4]).append(", Assorted=").append(colorCount[5]).append("\n");
        statsMessage.append("Statistics: Minimum Price=").append(minPrice).append(", Maximum Price=").append(maxPrice).append(", Price Range=").append(priceRange).append(", Total Number of Orders=").append(sizes.length).append(", Total Price=").append(totalPrice).append(", Average Price=").append(averagePrice);

        // Displaying the statistics
        JOptionPane.showMessageDialog(this, statsMessage.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FlowerShopGUI frame = new FlowerShopGUI();
                frame.setVisible(true);
            }
        });
    }
}
