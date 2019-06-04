import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
        int turn = 0;
        for(int currow = 1;currow<=n;currow++)
        {
          for(int curcol = 1;curcol<=currow;curcol++)
          {
             if(turn == 0) {
                    System.out.print("*");
                    turn = 1;
                }
                else {
                    System.out.print("#");
                    turn = 0;
                }}
            System.out.print("\n");
        }
        in.close();
    }
}