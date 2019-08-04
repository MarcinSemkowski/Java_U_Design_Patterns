package Observer.order;

public class Order {

 private Long orederNumber;

 private OrderStatus orederStatus;

 public Order(Long orederNumber, OrderStatus orederStatus) {
  this.orederNumber = orederNumber;
  this.orederStatus = orederStatus;
 }

 public Long getOrederNumber() {
  return orederNumber;
 }

 public void setOrederNumber(Long orederNumber) {
  this.orederNumber = orederNumber;
 }

 public OrderStatus getOrederStatus() {
  return orederStatus;
 }

 public void setOrederStatus(OrderStatus orederStatus) {
  this.orederStatus = orederStatus;
 }
}
