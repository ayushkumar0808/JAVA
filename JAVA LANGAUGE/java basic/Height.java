public class Height {
    double height = 5.9;

    void cal() {
        double metr;

        metr = height * 0.034;
        System.out.println("hieght in meter= " + metr);
    }

    public static void main(String[] args) {
        Height obj= new Height();
        obj.cal();

    }
}


