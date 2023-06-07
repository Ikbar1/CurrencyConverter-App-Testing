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
public class IdrConversion {
    //----------------Idr Section--------------//
        public double IdrtoUSD(double code,double amount) {
        double usd;
        usd = (amount * 0.000064);
        
        return usd;
    } 
        public double IdrtoAUD(double code,double amount) {
        double aud;
        aud = (amount * 0.000098);

        return aud;
    }
        public double IdrtoPound(double code,double amount) {
        double pound;
        pound = (amount * 0.000055);

        return pound;
    }
        public double IdrtoEuro(double code,double amount) {
        double euro;
        euro = (amount * 0.000063);

        return euro;
    }
        public double IdrtoSgd(double code,double amount) {
        double sgd;
        sgd = (amount * 0.000090);

        return sgd;
    } 
}
