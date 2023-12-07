package Codewars;

public class FuelCostCalculator {


    public static void main(String[] args) {


        System.out.println(fuelPrice(5, 3.00));
    }

    public static double fuelPrice(int litres, double pricePerLitre){
        // calculate the discount per litre based on the number of litres
        int discountPerLitre = Math.min((litres / 2) * 5, 25);

        // subtract the discount from the price per litre
        double finalPrice = pricePerLitre - (discountPerLitre/100.00);
        // multiply the final price by the number of litres and round to 2 decimal places
        return Math.round(finalPrice * litres * 100) / 100.00;
    }
}
