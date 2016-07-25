package cielo.lio.sdk.order.request;

import java.io.IOException;

import cielo.lio.sdk.order.Environment;
import cielo.lio.sdk.order.Order;
import cielo.lio.sdk.order.OrderItem;
import cielo.lio.sdk.order.OrderManagement;

public class LioTest {
	public static void main(String[] args) {
		OrderManagement orderManagement = new OrderManagement("device", "app-id", "merchant-id", "authorization-bearer",
				"frontend-id", Environment.PRODUCTION);
		
		Order order = new Order("0992f1d5-cee5-40d9-a964-8f4d6a9e4aa6");
		order.setReference("PEDIDO #1234");
		order.setStatus(Order.Status.DRAFT);
		order.setNotes("Mesa 1");
		order.setPrice(9155);
		
		order.addNewItem(500).setSku("ede8f84a-8b86-45cb-8e57-6a593c25c6ed")
		                     .setQuantity(2)
		                     .setUnitOfMeasure(OrderItem.UnitOfMeasure.EACH);
		
		order.addNewItem(1500).setSku("c2f5fb9a-5542-406e-8b79-17892329cda8")
		                      .setQuantity(3)
		                      .setUnitOfMeasure(OrderItem.UnitOfMeasure.EACH);
		
		order.addNewItem(550).setName("Valor avulso")
		                     .setQuantity(3)
		                     .setUnitOfMeasure(OrderItem.UnitOfMeasure.EACH);
		
		order.addNewItem(2005).setName("Valor avulso")
		                      .setUnitOfMeasure(OrderItem.UnitOfMeasure.EACH);
		
		try {
			orderManagement.getOrder("de305d54-75b4-431b-adb2-eb6b9e546014");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CieloRequestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Done");
	}
}
