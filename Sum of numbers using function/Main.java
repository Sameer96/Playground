import java.util.Scanner;
class Main{
    public static int fun (int m)
    {
      int i;
      int sum=0;
   	  for(i = 1;i <= m;i++)
      {
		sum = i + sum;
      }
      return (sum);
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner (System.in);
      int num = in.nextInt();
      int ans = fun(num);
      System.out.println(ans);
	}
}