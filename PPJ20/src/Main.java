public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(4);
        Square.show();
        Jam strawberry = new Jam("Strawberry", 0.1);
        Jam noName = new Jam(175.9);
        Jam noWeight = new Jam("Kakishi");
        strawberry.showJam();
        noName.showJam();
        noWeight.showJam();
        Ball b1 = Ball.makeBall();
        Ball b2 = Ball.makeBall();


    }
}