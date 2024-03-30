public class Tree {
    boolean evergreen;
    int height;
    int cross_section;

    public Tree(boolean evergreen, int height, int cross_section) {
        this.evergreen = evergreen;
        this.height = height;
        this.cross_section = cross_section;
    }
    public static Fruit pickFruit(){
        int rand = (int) (Math.random()*2);
        return switch (rand){
            case 0 -> new Apple();
            case 1 -> new Orange();
            case 2 -> new Pear();
            default -> null;
        };
    }
}
