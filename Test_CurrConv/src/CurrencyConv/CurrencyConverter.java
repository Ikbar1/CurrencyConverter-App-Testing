/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrencyConv;
import java.util.*;
import java.text.DecimalFormat;

/**
 *
 * @author Ikbar
 */
public class CurrencyConverter {
    
 
	public static void main(String[] args) {
 
		double amount, code, aud, pound, euro, idr, sgd, usd;
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("hi, Welcome to the Currency Converter!");
 
		System.out.println("which currency You want to Convert ? ");
		
		System.out.println("1: Australian Dollar \t2: British Pound Sterling \t3: European EURO \n4: Indonesian Rupiah \t5: Singapore Dollar \t6: US Dollar ");
                System.out.println("Enter the Currency Number");
		code = sc.nextInt();
                
                			
		if (code <= 0 ){
                    System.out.println("\n \n Please enter the right Currency Number \n \n");
                    sc.close();
                    
                }else if (code >= 7 ){
                    System.out.println("\n \n Please enter the right Currency Number \n \n");
                    sc.close();
            } else{
                    System.out.println("How much Money you want to convert ?");
                }
                    
		amount = sc.nextFloat();
 
		
		if (code == 1) {
                    // For AUD Conversion
                    
			usd = amount / 1.53;
			System.out.println("Your " + amount + " AUD is : " + f.format(usd) + " USD");
 
			pound = amount / 1.77;
			System.out.println("Your " + amount + " AUD is : " + f.format(pound) + " Pound");
 
			euro = amount / 1.54;
			System.out.println("Your " + amount + " AUD is : " + f.format(euro) + " EURO");
 
			idr = amount / 0.000098;
			System.out.println("Your " + amount + " AUD is : " + f.format(idr) + " IDR");
 
			sgd = amount / 1.10;
			System.out.println("Your " + amount + " AUD is : " + f.format(sgd) + " SGD");
                        
		} else if (code == 2) {
                    // For Pound Conversion
 
			aud = amount * 1.77;
			System.out.println("Your " + amount + " Pound is : " + f.format(aud) + " AUD");
 
			usd = amount * 1.16;
			System.out.println("Your " + amount + " Pound is : " + f.format(usd) + " USD");
 
			euro = amount * 1.15;
			System.out.println("Your " + amount + " Pound is : " + f.format(euro) + " Euro");
 
			idr = amount * 18026.15;
			System.out.println("Your " + amount + " Pound is : " + f.format(idr) + " IDR");
 
			sgd = amount * 1.62;
			System.out.println("Your " + amount + " Pound is : " + f.format(sgd) + " SGD");
                    
		} else if (code == 3) {
                    // For EURO Conversion
 
			aud = amount * 1.54;
			System.out.println("Your " + amount + " EURO is : " + f.format(aud) + " AUD");
 
			usd = amount * 1.01;
			System.out.println("Your " + amount + " EURO is : " + f.format(usd) + " USD");
 
			pound = amount * 0.87;
			System.out.println("Your " + amount + " EURO is : " + f.format(pound) + " Pound");
 
			idr = amount * 15702.84;
			System.out.println("Your " + amount + " EURO is : " + f.format(idr) + " IDR");
 
			sgd = amount * 1.41;
			System.out.println("Your " + amount + " EURO is : " + f.format(sgd) + " SGD");
			
		} else if (code == 4) {
			// For IDR Conversion
 
			aud = amount * 0.000098;
			System.out.println("Your " + amount + " IDR is : " + f.format(aud) + " AUD");
 
			usd = amount * 0.000064;
			System.out.println("Your " + amount + " IDR is : " + f.format(usd) + " USD");
 
			pound = amount * 0.000055;
			System.out.println("Your " + amount + " IDR is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.000063;
			System.out.println("Your " + amount + " IDR is : " + f.format(euro) + " EURO");
 
			sgd = amount * 0.000090;
			System.out.println("Your " + amount + " IDR is : " + f.format(sgd) + " SGD");
			
		} else if (code == 5) {
                    // For SGD Conversion
 
			aud = amount * 1.09;
			System.out.println("Your " + amount + " SGD is : " + f.format(aud) + " AUD");
 
			usd = amount * 0.72;
			System.out.println("Your " + amount + " SGD is : " + f.format(usd) + " USD");
 
			pound = amount * 0.62;
			System.out.println("Your " + amount + " SGD is : " + f.format(pound) + " pound");
 
			euro = amount * 0.71;
			System.out.println("Your " + amount + " SGD is : " + f.format(euro) + " EURO");
 
			idr = amount * 11154.56;
			System.out.println("Your " + amount + " SGD is : " + f.format(idr) + " IDR");
 
		} else if (code == 6) {
			// For US Dollar Conversion
 
			aud = amount * 1.53;
			System.out.println("Your " + amount + " USD is : " + f.format(aud) + " AUD");
 
			pound = amount * 0.86;
			System.out.println("Your " + amount + " USD is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.99;
			System.out.println("Your " + amount + " USD is : " + f.format(euro) + " EURO");
 
			idr = amount * 15596.35;
			System.out.println("Your " + amount + " USD is : " + f.format(idr) + " IDR");
 
			sgd = amount * 1.40;
			System.out.println("Your " + amount + " USD is : " + f.format(sgd) + " SGD");

                }  else {
			System.out.println("Invalid input");
		}
		
		System.out.println("Your Currency Converting is done. Thank you for using our apps");
	}

}
