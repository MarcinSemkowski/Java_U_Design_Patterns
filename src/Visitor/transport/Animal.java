package Visitor.transport;

public class Animal {

    private String kind;
    private int weight;


    public Animal(String name, int weight) {
        this.kind = name;
        this.weight = weight;
    }



    public String getKind() {
        return kind;
    }

    public int getWeight() {
        return weight;
    }

}
