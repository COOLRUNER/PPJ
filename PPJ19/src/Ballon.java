public class Ballon {
    double volume;
    public Ballon() {
        volume = (Math.random()*1.004) + 0.005;
    }
    public double getLoad(){
        double loadCap = volume * 857;
        return loadCap;
    }
}
