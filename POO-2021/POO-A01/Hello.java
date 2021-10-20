public class Hello {
    int x = 6;
  
    public static void main(String[] args) {
      Hello myObj1 = new Hello();  // Object 1
      Hello myObj2 = new Hello();  // Object 2
      System.out.println(myObj1.x);
      System.out.println(myObj2.x);
    }
  }