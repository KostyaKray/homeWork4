public class Return {

    public static void main(String[] args) {
      myMethod();
      int myInt = 1;
        System.out.println(myInt);
        myInt = myMethod();
        System.out.println(myInt);
    } 
      static int myMethod(){
          System.out.println("this is return ");


          return 101;
      }

}
