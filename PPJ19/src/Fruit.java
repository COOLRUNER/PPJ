public class Fruit {
     String name;
     double weight = (Math.random()*1.3) + 0.5;

    public Fruit(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println(name + " "+ weight);
    }
}
