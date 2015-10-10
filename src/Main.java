public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        outputArray();
    }

    private static void outputArray() {
        double[] items = new double[]{2.3, 4.5, 7.5, 5.3};

        for (double item : items) {
            System.out.println("Item: " + item);
        }

    }
}
