abstract class one
{
    public abstract void m1();
    public abstract void m2();
}
class Second extends one {
    public void m1() {
        System.out.println("Welcome to java");
    }

    public void m2() {
        System.out.println("Welcome to java world");
    }
}
  class Third extends Second
{

   public void m2()
   {
       System.out.println("Programmer is best person");
   }
}
    class AbstractClass
 {
     public static void main(String[] args)
     {
       one obj=new one() {
           @Override
           public void m1()
           {
               System.out.println("Vivek kumar verma");
           }

           @Override
           public void m2()
           {
               System.out.println("Welcome");
           }
       } ;
       obj.m1();
       obj.m2();
     }
 }

