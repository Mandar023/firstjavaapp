class prime 
{

public static void main(String [] args)
{
int n=30;
int c=0;
for (int i=2;i<n;i++)
{
if (n%i==0)
{                                                                                                         
c=c                                                                                                                                                                                                                              
break;
}
}
if (c==1)
{
System.out.println("No is Prime");
}
else
{
System.out.println("No is not prime");
}
}
}