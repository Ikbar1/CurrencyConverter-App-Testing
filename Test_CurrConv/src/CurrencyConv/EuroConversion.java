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
public class EuroConversion {
    //----------------Euro Section--------------//
        public double EurotoUSD(double code,double amount) {
        double usd;
        usd = (amount * 1.01);
        
        return usd;
    } 
        public double EurotoAUD(double code,double amount) {
        double aud;
        aud = (amount * 1.54);

        return aud;
    }
        public double EurotoPound(double code,double amount) {
        double pound;
        pound = (amount * 0.87);

        return pound;
    }
        public double EurotoIdr(double code,double amount) {
        double idr;
        idr = (amount * 15702.84);

        return idr;
    }
        public double EurotoSgd(double code,double amount) {
        double sgd;
        sgd = (amount * 1.41);

        return sgd;
    }
}
