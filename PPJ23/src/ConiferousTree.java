public class ConiferousTree extends Tree{
    int needleCount;
    double coneLength;

    public ConiferousTree(boolean evergreen, int height, int cross_section, int needleCount, double coneLength) {
        super(evergreen, height, cross_section);
        this.needleCount = needleCount;
        this.coneLength = coneLength;
    }

    public String toString(){
        return super.toString() +" needle count: " + needleCount + " cone length" + coneLength;
    }
}
