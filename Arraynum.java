import java.util.Scanner;
class Arraynum
{ 
public static void main(String[] a)
{
Scanner s1= new Scanner(System.in);
int num[] = new int[10];

  for(int i=0;i<10;i++)
  {
 System.out.println("Enter the number");
  num[i] =s1.nextInt();
  
  }
for (int i = 0; i <10; i++)
{
if (num[i]%2==0)
System.out.println("the even numbers is "+num[i]);
}
System.out.println("Program is over:");
 
 }

}
