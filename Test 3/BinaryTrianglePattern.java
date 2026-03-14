public class BinaryTrianglePattern {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            int value = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value = (value == 1) ? 0 : 1;
            }

            System.out.println();
        }
    }
}

