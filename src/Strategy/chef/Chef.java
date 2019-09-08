package Strategy.chef;

public class Chef {

    private String name;


    public void cook(){
        System.out.println("Gotuję jajka na twardo");
    }

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
