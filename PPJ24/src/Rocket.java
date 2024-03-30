public class Rocket {
    String name;
    int weightOfFuel;

    public Rocket(String name, int weightOfFuel) {
        this.name = name;
        this.weightOfFuel = weightOfFuel;
    }
    public void refuel(){
        int fueled = (int) ((Math.random()*10000)+0);
        weightOfFuel += fueled;
    }

    public void start() throws Exception{
        boolean checkFuel;
        if (weightOfFuel >= 1000){
            System.out.println("start");
        }else throw new Exception("start-calceled");
    }
}
