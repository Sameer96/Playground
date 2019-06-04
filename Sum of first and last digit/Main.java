import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ld,fd,rev=0,r,s;
      ld = n%10;
      
      while (n>0)
      {
        r = n%10;
        rev = rev*10 + r;
        n = n/10;
        
      }
      fd = rev %10;
      s = fd +ld;
      System.out.println(s);
	}
}