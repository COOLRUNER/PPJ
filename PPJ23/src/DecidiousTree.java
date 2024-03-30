public class DecidiousTree extends Tree{
    int leafShape;

    public DecidiousTree(boolean evergreen, int height, int cross_section, int leafShape) {
        super(evergreen, height, cross_section);
        this.leafShape = leafShape;
    }


    public String toString() {
        return super.toString() + " leaf shape = " + leafShape;
    }
}
