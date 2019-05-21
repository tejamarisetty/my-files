import java.util.*;
class fac
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0)
{
int n=sc.nextInt();
int fact=1;
for(int i=0;i<n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}}}