public class Main {
    public static void main(String[] args) {
        System.out.println(MathOperations.CalculateCircleArea(4.6));
        FruitTree appwle = new FruitTree(false, 32, 7, 5, "Apples");
        System.out.println(appwle);
        Apple red = new Apple();
        System.out.println(red);


        Fruit[] arr = new Fruit[100];
        double mass = 0;
        int a = 0;
        while (mass < 5000){
            arr[a] = Tree.pickFruit();
            mass = mass + arr[a].getMass();
            a++;
        }
        int apple = 0, orange=0, pear=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                break;
            }
            switch (arr[i].getName()){
                case "Apple" -> apple++;
                case "Pear" -> pear++;
                case "Orange" -> orange++;

            }
        }
        System.out.println( "apples: " + apple + " oranges: " + orange + " pears: "+ pear);
    }
}