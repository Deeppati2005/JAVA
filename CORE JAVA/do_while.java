import java.util.*;

public class do_while{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
do{
System.out.println("Enter Your Number : ");
int n = sc.nextInt();
if(n%10==0){
break;
}

}while(true);
}
}