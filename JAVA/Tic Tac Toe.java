import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=(a-1)/3;
    int c=(a-1)%3;
    System.out.println(b + " " + c);
    
  }
}