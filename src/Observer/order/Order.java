package Observer.order;

public class Order {

 private Long orederNumber;

 private OrderStatus orederStatus;

 public Order(Long orederNumber, OrderStatus orederStatus) {
  this.orederNumber = orederNumber;
  this.orederStatus = orederStatus;
 }
}
