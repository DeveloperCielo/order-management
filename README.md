# Cielo Lio Order Management

SDK para integração com o order management da plataforma da Cielo/M4U na cloud.

## Configuração do Order Management

```java
OrderManagement orderManagement = new OrderManagement("id do device",
                                                      "id do app",
                                                      "id do merchant",
                                                      "token de autorização",
                                                      "id do frontend",
                                                      Environment.PRODUCTION);
```

## Criação de um Order

```java
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
    order = orderManagement.createOrder(order);
} catch (IOException e) {
    // ...
} catch (CieloRequestException e) {
    e.printStackTrace();
}
```

## Cancelando um Order

```java
try {
	orderManagement.cancelOrder("de305d54-75b4-431b-adb2-eb6b9e546014");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (CieloRequestException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```

## Liberando um Order para pagamento

```java
try {
	orderManagement.placeOrder("de305d54-75b4-431b-adb2-eb6b9e546014");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (CieloRequestException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```

## Liberando um Order para verificação

```java
try {
	orderManagement.releaseOrderForVerification("de305d54-75b4-431b-adb2-eb6b9e546014");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (CieloRequestException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```

## Aprovar um Order após o pagamento

```java
try {
	orderManagement.approveOrder("de305d54-75b4-431b-adb2-eb6b9e546014");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (CieloRequestException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```

## Reprovar um Order após o pagamento

```java
try {
	orderManagement.rejectOrder("de305d54-75b4-431b-adb2-eb6b9e546014");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (CieloRequestException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```

## Concluid um Order

```java
try {
	orderManagement.closeOrder("de305d54-75b4-431b-adb2-eb6b9e546014");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (CieloRequestException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```

## Consultar um Order

```java
try {
	orderManagement.getOrder("de305d54-75b4-431b-adb2-eb6b9e546014");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (CieloRequestException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```
