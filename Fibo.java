public class Fibo {

    public static void main(String[] args) {

        int n = (Integer.parseInt(args[0])), a = 0, b = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(a + " + ");

            int sum = a + b;
            a = b;
            b= sum;
        }
    }
}