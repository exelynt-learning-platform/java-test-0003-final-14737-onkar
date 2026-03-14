public class BinaryTriangle {
    public static void main(String[] args) {

        int rows = 6;

        for (int i = 1; i <= rows; i++) {

            int num = i % 2;   // decide starting number

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 0) ? 1 : 0;   // toggle between 0 and 1
            }

            System.out.println();
        }
    }
}
