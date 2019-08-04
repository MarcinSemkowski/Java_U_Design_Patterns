package Observer.order;

import Observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {

 private Long orderNumber;

 private OrderStatus orderStatus;

 private Set<Observer>  registeredObservers;


 public Order(Long orederNumber, OrderStatus orederStatus) {
  this.orderNumber = orederNumber;
  this.orderStatus = orederStatus;
   registeredObservers = new HashSet<>();
 }


 @Override
 public void registerObserver(Observer observer) {
  registeredObservers.add(observer);
 }

 @Override
 public void unregisterObserver(Observer observer) {
   registeredObservers.remove(observer);
 }

 @Override
 public void notifyObservers() {
    for(Observer observer : registeredObservers){
     observer.update(this);
    }
 }

 public void changedOrderStatus(OrderStatus orderStatus){
   setOrderStatus(orderStatus);
   notifyObservers();
 }

 public Long getOrderNumber() {
  return orderNumber;
 }

 public void setOrderNumber(Long orderNumber) {
  this.orderNumber = orderNumber;
 }

 public OrderStatus getOrderStatus() {
  return orderStatus;
 }

 public void setOrderStatus(OrderStatus orderStatus) {
  this.orderStatus = orderStatus;
 }
}
