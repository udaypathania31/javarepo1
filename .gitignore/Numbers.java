import java.util.*;
public class Numbers
{
public static void main(String[] x)
{
int n=0, i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter value n:");
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(i%2==0)
System.out.println(i+" ");
}
System.out.println();
}
}