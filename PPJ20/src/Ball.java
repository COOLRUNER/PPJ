public class Ball {
    double radius;
    public int ballCounter=0;

    public Ball(double radius) {
        this.radius = radius;
    }

    public static Ball makeBall(){
        Ball ball = new Ball( (Math.random()*11)+10);
        ballCounter ++;
        return ball;
    }
    public int showCounter(){
        return(ballCounter);
    }

}
