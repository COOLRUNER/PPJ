public class Donkey {
    double mass = 60;
    Ballon[] ballons = new Ballon[0];
     public void addBallon(Ballon ballon){
        Ballon[] newBallons = new Ballon[ballons.length + 1];
        for (int i = 0; i < ballons.length; i++) {
            newBallons[i] = ballons[i];
            int count = i;
        }
        newBallons[ballons.length] = ballon;
        ballons = newBallons;
    }
    public boolean isFlying() {
       double liftMass = 0;
        for (int i = 0; i < ballons.length; i++) {
            liftMass = ballons[i].getLoad();
        }
        if (mass>liftMass){
            return false;
        }
        else return true;

    }
}
