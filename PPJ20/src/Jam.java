public class Jam {
    private String flavor;
    private double weight;

    public Jam(String flavor, double weight) {
        this.flavor = flavor;
        this.weight = weight;
    }

    public Jam(double weight) {
        this("No name", weight);
    }

    public Jam(String flavor) {
        this(flavor, 100.0);
    }

    public void showJam(){
        System.out.println(flavor + " " + weight);
    }
}

