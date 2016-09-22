/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator;

public class MoneyCalculator {

    
    public static void main(String[] args) throws Exception{
        MoneyCalculadtor money Calculator = new MoneyCalculator();
        System.out.println ("Introducir la cantidad de dolares");
        Scanner scanner = new Scanner (System.in);
        double amount = Double.parseDouble(Scanner.next());
        double changeRate = getExchangeRate("USD","EUR");
        System.out.println(amoun + " USD equivalen a " + amount * exchangeRate " EUR");
    }
    
    private static double getExchangeRate(String from, String to) throws Exception{
        // Metodo delas transparencias
    }
    
}
