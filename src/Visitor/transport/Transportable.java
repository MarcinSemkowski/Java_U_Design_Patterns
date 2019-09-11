package Visitor.transport;

import Visitor.transport.Visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);

}