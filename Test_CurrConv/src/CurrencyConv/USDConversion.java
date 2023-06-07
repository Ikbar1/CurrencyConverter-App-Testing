/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CurrencyConv;

/**
 *
 * @author Azhar
 */
public class USDConversion {
     //----------------USD Section--------------//
        public double USDtoSgd(double code,double amount) {
        double sgd;
        sgd = (amount * 1.40);
        
        return sgd;
    } 
        public double USDtoAUD(double code,double amount) {
        double aud;
        aud = (amount * 1.53);

        return aud;
    }
        public double USDtoPound(double code,double amount) {
        double pound;
        pound = (amount * 0.86);

        return pound;
    }
        public double USDtoEuro(double code,double amount) {
        double euro;
        euro = (amount * 0.99);

        return euro;
    }
        public double USDtoIdr(double code,double amount) {
        double idr;
        idr = (amount * 15596.35);

        return idr;
    }
}
