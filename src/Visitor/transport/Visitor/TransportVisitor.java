package Visitor.transport.Visitor;

import Visitor.transport.Animal;
import Visitor.transport.Person;
import Visitor.transport.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);
    void visit(Person person);
    void visit(Shipment aShipment);

}