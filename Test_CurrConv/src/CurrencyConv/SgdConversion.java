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
public class SgdConversion {
    //----------------SGD Section--------------//
        public double SgdtoUSD(double code,double amount) {
        double usd;
        usd = (amount * 0.72);
        
        return usd;
    } 
        public double SgdtoAUD(double code,double amount) {
        double aud;
        aud = (amount * 1.09);

        return aud;
    }
        public double SgdtoPound(double code,double amount) {
        double pound;
        pound = (amount * 0.62);

        return pound;
    }
        public double SgdtoEuro(double code,double amount) {
        double euro;
        euro = (amount * 0.71);

        return euro;
    }
        public double SgdtoIdr(double code,double amount) {
        double idr;
        idr = (amount * 11154.56);

        return idr;
    }
}
