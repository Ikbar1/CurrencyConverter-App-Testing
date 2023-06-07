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
public class AUDConversion {
    //----------------AUD Section--------------//
        
        public double AUDtoUSD(double code,double amount) {
        double usd;
        usd = (amount / 1.53);
        
        return usd;
    } 
        public double AUDtoPound(double code,double amount) {
        double pound;
        pound = (amount / 1.77);

        return pound;
    }
        public double AUDtoEuro(double code,double amount) {
        double euro;
        euro = (amount / 1.54);

        return euro;
    }
        public double AUDtoIdr(double code,double amount) {
        double idr;
        idr = (amount / 0.000098);

        return idr;
    }
        public double AUDtoSgd(double code,double amount) {
        double sgd;
        sgd = (amount / 1.10);

        return sgd;
    }
}
