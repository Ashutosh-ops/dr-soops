public class Gcd
{
    static int gcd(int x, int y)
    {
        int r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
 
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
 
    static int lcm(int x, int y)
    {
        int a;
        a = (x > y) ? x : y;
        while(true)
        {
            if(a % x == 0 && a % y == 0)
                return a;
            ++a;
        }	
    }
 
    public static void main(String args[])
    {
        int x = (Integer.parseInt(args[0]));
        int y = (Integer.parseInt(args[1]));
 
        System.out.println("The GCD of two numbers is: " + gcd(x, y));
        System.out.println("The LCM of two numbers is: " + lcm(x, y));	
    }
}