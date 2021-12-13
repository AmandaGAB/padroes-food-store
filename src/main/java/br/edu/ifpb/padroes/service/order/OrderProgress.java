package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order;

public class OrderProgress implements OrderState{
   
		@Override
		public OrderState CANCELED() {
			System.out.println("Pedido Cancelado!");
			return null;
		}
		@Override
		public OrderState PAYMENT_REFUSED() {
			System.out.println("Pagamento Recusado!");
			return null;
		}
		@Override
		public Order IN_PROGRESS() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public Order PAYMENT_SUCCESS() {
			// TODO Auto-generated method stub
			return null;
		}
 
}
