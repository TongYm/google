public class Text{
    public static void main (String[] args){
	 
    System.out.println("输入年龄");
    Scanner scan = nwe Scanner (System.in);
    int age = scan.nextInt();
    
    int j;
    if(age < 15)
    j = 1;
    else
    j = 2;
     
    switch(j){
	case 1;
	System.out.println("小姐姐");
	break;
	case 2;
	System.out.println("大姐姐");
	break;
	}	 
}
}
