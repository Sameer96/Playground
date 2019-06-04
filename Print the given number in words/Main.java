import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
    
     if(num==1)
       System.out.println("one");
      else if(num==2)
        System.out.println("two");
        else if(num==3)
          System.out.println("Three");
      else if(num==4)
        System.out.println("four");
      else if(num==5)
        System.out.println("Five");
      else 
        System.out.println("Invalid");
	}
}