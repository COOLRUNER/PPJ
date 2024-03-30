public class Jar {
    Jam jam;
    boolean boolIsOpen = false;
    static int count = 0;
    Jar(Jam jam){
        this.jam = jam;
        boolIsOpen = false;
        count ++;
         }
    void open(){
        boolIsOpen = true;
    }
    void close(){
        boolIsOpen = false;
    }
    void isOpen(){
        System.out.println(boolIsOpen);
    }
    public static int jarCount(){
        return (count);
    }


}
