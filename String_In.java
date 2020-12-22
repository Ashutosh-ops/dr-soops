class String_In{
  public static void main(String[] args) {
    String greet = "Hello! World";
    System.out.println("String: " + greet);
    int length = greet.length();
    System.out.println("Length: " + length);


    String first = "Java ";
    System.out.println("First String: " + first);
    String second = "Programming";
    System.out.println("Second String: " + second);
    String joinedString = first.concat(second);
    System.out.println("Joined String: " + joinedString);

    String first1 = "java programming";
    String second1 = "java programming";
    String third = "python programming";
    boolean result1 = first1.equals(second1);
    System.out.println("Strings first and second are equal: " + result1);
    boolean result2 = first1.equals(third);
    System.out.println("Strings first and third are equal: " + result2);
  }
}