public class Dec_to_bin
{
    public static void main(String[] args) 
    {
        int n=(Integer.parseInt(args[0])), a;
        String x = "";
        while(n > 0)
        {
            a = n % 2;
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
    }
}