public class PrimeRange {

    public static void main(String[] args) {

        int low = (Integer.parseInt(args[0])), high = (Integer.parseInt(args[1]));

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");
            ++low;
        }
    }
}