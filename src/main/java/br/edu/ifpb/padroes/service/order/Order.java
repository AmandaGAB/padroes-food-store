package br.edu.ifpb.padroes.service.order;

import br.edu.ifpb.padroes.domain.Order.OrderStatus;

public class Order {
    private OrderState estadoAtual;
    public Order(){
        this.estadoAtual = OrderStateEnum.CANCELED;
    }
    public Order(OrderState estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
    public void canceled() {
		this.estadoAtual = (OrderState) estadoAtual.CANCELED();
	}
}
