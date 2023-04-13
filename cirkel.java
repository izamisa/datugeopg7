public class Main {
}

    public static void main(String[] args) {

        double w = 10, h = 8;

        findRadius(w, h);
    }


    static void findRadius(double w, double h) {
        //find radius using the formula
        double r = ((w * w) / (8 * h) + h / 8);
        System.out.println( "Radius of the circle: "+r);
    }
}