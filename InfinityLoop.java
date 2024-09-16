public class InfinityLoop {
    public static void main(String[] args) {
        int a = 0;
        while (true) {
            a = a + 1;
            System.out.println(a);
            if (a == 5) {
                System.out.println("Stoping Point of Infinity Loop is : "+a);
                break;
            }
        }
    }
}
