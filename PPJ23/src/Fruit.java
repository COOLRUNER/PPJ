public class Fruit {
    private String name;
    double mass;

    public Fruit(String name) {
        this.name = name;
        this.mass = (Math.random()*150) + 100;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
