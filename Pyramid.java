
import java.util.Scanner;


public class Pyramid{
 
    public static void main (String[] args){
	System.out.print("请输入金字塔层数:");
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int i,j,k;
	for(i = 1; i <= n; i++)       
	{           
         for(j = 1; j <= n - i; j++)             
			System.out.printf(" ");          
		 for(k = 1; k <= 2 * i -1; k++)          
			System.out.print("*");          
		    System.out.print("\n");


        }
	}
}
