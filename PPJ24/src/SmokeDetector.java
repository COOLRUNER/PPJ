public class SmokeDetector extends Alarm{
    boolean smoke;
public SmokeDetector (boolean smoke){
    this.smoke = smoke;
}
public void check() throws Alarm{
    if (smoke != true) {
        System.out.println("there is no smoke");
    }
    else throw new Alarm();

}
}
