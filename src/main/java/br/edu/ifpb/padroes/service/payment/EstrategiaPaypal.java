package br.edu.ifpb.padroes.service.payment;

public class EstrategiaPaypal {

    
    public void doPayment() throws Exception {
        try{
            System.out.println("Do paypal payment!");
     } catch(Exception e){
         throw new Exception("unknown payment method");}
      
     }
 
  

}
