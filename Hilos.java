
public class Hilos
{
   //a thread is a method of execution. you can execute multiple mains at once. It is an execution of a program
   
   public static void main(String []aaa)
   {
       try
       {
       for (int z = 1; z <= 10 ; z++)
       {
           for(int i = 0; i <= 40; i++)
         {
           System.out.print('\u000c');     
           for (int j = 0; j <= i; j++)
           {
               System.out.print(" ");
           }
           System.out.print("->");
           Thread.sleep(50);
       }
      
      for(int i = 40; i >= 0; i--)
       {
           System.out.print('\u000c');     
           for (int j = i; j >= 0; j--)
           {
               System.out.print(" ");
           }
           System.out.print("<-");
           Thread.sleep(50);
      }
     }
      }
      catch (InterruptedException e)
      {
          System.out.println("Atrapando");
      }
   }

}
