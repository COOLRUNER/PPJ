public class Square {
    private static int side;

    public Square(int side) {
        this.side = side;
    }
    static void show(){
        int area = side * side;
        System.out.println("Area: " + area);
        int cubeVolme = area * side;
        System.out.println("Volume: " + cubeVolme);
    }
}
