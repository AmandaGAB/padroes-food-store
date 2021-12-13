package br.edu.ifpb.padroes.service.payment;

public class EstrategiaBillet {

    
    public void doPayment() throws Exception {
        try{
            System.out.println("Do billet payment!");
     } catch(Exception e){
         throw new Exception("unknown payment method");}
      
     }
             


}
