import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sd;
      while(n>=100)
      {
        n = n / 10;
      }
      
     sd = n%10;
      System.out.println(sd);
    }
}