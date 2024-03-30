public class FruitTree extends DecidiousTree{
    String fruitName;

    public FruitTree(boolean evergreen, int height, int cross_section, int leafShape, String fruitName) {
        super(evergreen, height, cross_section, leafShape);
        this.fruitName = fruitName;
    }
    public String toString(){
        return super.toString()+ " fruit: " + fruitName;
    }
}
