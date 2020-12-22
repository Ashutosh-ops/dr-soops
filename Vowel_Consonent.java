public class Vowel_Consonent {

    public static void main(String[] args) {

        switch ((args[0].charAt(0))) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println((args[0].charAt(0)) + " is vowel");
                break;
            default:
                System.out.println((args[0].charAt(0)) + " is consonant");
        }
    }
}