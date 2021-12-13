import br.edu.ifpb.padroes.domain.Order;

public interface OrderState{​	  

    Order IN_PROGRESS();	  

    Order CANCELED();	  
    
    Order PAYMENT_SUCCESS();	  
    
    Order PAYMENT_REFUSED();
    
​}