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
public class PoundConversion {
    //----------------Pound Section--------------//
        public double PoundtoUSD(double code,double amount) {
        double usd;
        usd = (amount * 1.16);
        
        return usd;
    } 
        public double PoundtoAUD(double code,double amount) {
        double aud;
        aud = (amount * 1.77);

        return aud;
    }
        public double PoundtoEuro(double code,double amount) {
        double euro;
        euro = (amount * 1.15);

        return euro;
    }
        public double PoundtoIdr(double code,double amount) {
        double idr;
        idr = (amount * 18026.15);

        return idr;
    }
        public double PoundtoSgd(double code,double amount) {
        double sgd;
        sgd = (amount * 1.62);

        return sgd;
    }
}
