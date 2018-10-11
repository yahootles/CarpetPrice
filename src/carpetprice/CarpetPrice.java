/*
 * Andrew Thompson
 * September 19, 2018
 * This program calculates the price of a carpet
 */

package carpetprice;

/**
 *
 * @author antho6229
 */

import java.text.DecimalFormat;

public class CarpetPrice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width = 6;
        double length = 8.5;
        double pricePerSquareMeter = 19.95;
        double area = 0;
        double totalPrice = 0;
        
        DecimalFormat df = new DecimalFormat("$###.##");
        
        area = length * width;
        totalPrice = (area * pricePerSquareMeter);
        
        System.out.println("The price of the carpet is " + df.format(totalPrice) + ".");
    }
    
}
