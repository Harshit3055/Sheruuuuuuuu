import java.util.*;
class Greatest {
    public static void main(String agrs[])
    {
        Scanner in = new Scanner(System.in);
       System.out.println("Enter any three numbers");
       int a = 0, b = 0, c = 0;
       a = in.nextInt();
       b = in.nextInt();
       c = in.nextInt();
       if(a>b)
       {
         if(a>c)
         {
            System.out.println("The Largest No = "+a);
         }
         else
         {
             System.out.println("The Largest No = "+c);
         }
       }
       else
       {
           if(b>c)
           {
               System.out.println("The Largest No is = "+b);
           }
           else
           {
               System.out.println("The Largest No is = "+c);
           }
       }

    }

}
