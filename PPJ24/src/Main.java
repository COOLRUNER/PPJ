public class Main {
    public static void main(String[] args) {
        SmokeDetector SmokeDetector1 = new SmokeDetector(true);
        SmokeDetector SmokeDetector2 = new SmokeDetector(false);
        try{
            SmokeDetector1.check();
            SmokeDetector2.check();
        }catch (Alarm fire){
            System.out.println(fire.getMessage());
        }
        Rocket rocket = new Rocket("rock", 2);
        rocket.refuel();

        try {
            rocket.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
