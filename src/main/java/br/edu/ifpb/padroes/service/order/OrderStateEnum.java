package br.edu.ifpb.padroes.service.order;

public enum OrderStateEnum implements OrderState{
    IN_PROGRESS {
        public OrderState IN_PROGRESS() {
			System.out.println("!");
			return null;
		}
		public OrderState PAYMENT_SUCCESS() {
			System.out.println("Sucesso!");
			return null;
		}

		public OrderState PAYMENT_REFUSED() {
			System.out.println("!");
			return null;
		}
	},

	CANCELED {
		public OrderState CANCELED() {
			System.out.println("Cancelado!");
			return null;
		}
    }
}
