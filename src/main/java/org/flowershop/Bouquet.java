package org.flowershop;

public class Bouquet {

    private double sizeMarkup;
    private double flowerMarkup;
    private double colourMarkup;
    private double price;

    public Bouquet(double sizeMarkup, double flowerMarkup, double colourMarkup) {
        this.sizeMarkup = sizeMarkup;
        this.flowerMarkup = flowerMarkup;
        this.colourMarkup = colourMarkup;
        calculatePrice();
    }

    private void calculatePrice() {
        this.price = (flowerMarkup + colourMarkup) * sizeMarkup;
    }

    public double getPrice() {
        return price;
    }
}
