package br.edu.ifpb.padroes.service.payment;

public class EstrategiaCreditCard {

    public void doPayment() throws Exception {
       try{
           System.out.println("Do credit card payment!");
    } catch(Exception e){
        throw new Exception("unknown payment method");}
     
    }

}
