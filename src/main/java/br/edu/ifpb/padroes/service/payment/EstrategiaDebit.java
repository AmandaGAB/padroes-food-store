package br.edu.ifpb.padroes.service.payment;

public class EstrategiaDebit {

        
    public void doPayment() throws Exception {
        try{
            System.out.println("Do debit payment!");
     } catch(Exception e){
         throw new Exception("unknown payment method");}
      
     }
             
              


}

