import java.util.Scanner;
public class Main{
    public static int gcd(int a,int b, int c){
      int min,ans=0;
      if(a<b && a<c)
        min = a;
      else if(b<c)
        min = b;
      else 
        min = c;
      while(min >= 1)
      {
		if((a%min == 0)&&(b%min==0)&&(c%min==0)){
			ans = min;
            break;
        }
        min--;
      }
      return ans;
    }
      
	public static void main (String[] args)
	{
	  Scanner in = new Scanner (System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int ans = gcd(n1,n2,n3);
      System.out.println(ans);
	}
}