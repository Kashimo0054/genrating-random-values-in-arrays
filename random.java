public class App {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            int random = (int) (Math.random() * 100);
            System.out.println(random);
        }

    }
}
