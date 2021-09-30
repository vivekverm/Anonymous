/* Annonymous nested class
abstract:- If you do not know behaviour declare method with abstract modifier.
if a class having abstract method the it is mandatory to create the calss abstract modifier.
 */
 abstract class Result
{
   abstract public void res();
}
 /* class Second extends Result
{
    public void res()
    {
        System.out.println("Welcome");
    }
}*/
public class TestAnonymousClass {
    public static void main(String[] args) {
       Result obj=new Result() {
           @Override
           public void res()
           {

               System.out.println();
           }


       };
       Result obj2 =new Result() {
           @Override
           public void res() {

           }
       };
    }
 }
