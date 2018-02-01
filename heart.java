import java.util.*;
public class heart
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int r=0,i,j,t,m,d=0,c,p;
int n=sc.nextInt();
m=(n/2)-1;
t=m-1;
c=(n/2)+3;
p=t;
if(n%2!=0 && n>5){
for(i=0;i<=n+1;i++)
{
for(j=0;j<(n+3);j++)
{

if(i<t)
{
if(j<p || j>(n+2-p) || (j>(n/2) && j<c ))
{
System.out.print(" ");
}
else
{
System.out.print("*");
}
}

if(i>=t && i<(t+m))
{
System.out.print("*");
}

if(i>=(t+m))
{
if(j<p || j>(n+2-p)){
System.out.print(" ");
}
else
{
System.out.print("*");
if(i==n+1){
r++;}
}
}
}
if(i<t)
{
p=p-1;
c=c-2;
}

if(i>=(t+m))
{
p=p+1;
if(r>1){i=i-1;}
}
System.out.print("\n");
r=0;
}
}
}
}