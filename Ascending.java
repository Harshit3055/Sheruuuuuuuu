import java.util.*;
class Ascending
{
  public static void main(String args[])
  {
      Scanner in = new Scanner(System.in);
      int a = 0,b = 0,c = 0;
      int max = 0,mid = 0,min = 0;
      System.out.println("Enter Three Numbers");
      a = in.nextInt();
      b = in.nextInt();
      c = in.nextInt();
      if(a>b && a>c)
      {
          max = a;
          if(b>c)
          {
              mid = b;
              min = c;
          }
          else
          {
              mid = c;
              min = b;
          }
      }
      if(b>a && b>c)
      {
          max = b;
          if(a>c)
          {
              mid = a;
              min = c;
          }
          else
          {
            mid = c;
            min = a;
          }
      }
      if(c>b && c>a)
      {
          max = c;
          if(b>a)
          {
              mid = b;
              min = a;
          }
          else
          {
              mid = a;
              min = b;
          }
      }

      System.out.println("The Numbers in Ascending Order is");
      System.out.println(max + ", "+ mid +", "+min);
      
  }
}