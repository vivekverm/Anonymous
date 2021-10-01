class First
{
    First(int l)
    {
        System.out.println("First");
    }
}
class Second extends First
{
    Second(int w,int u, int i)
    {   super(u);
        System.out.println("Second");
    }

}
class Third extends Second
{
    Third(int a,int c,int b,int f)
    {   super(c,f,b);
        System.out.println("Third");
    }
}

public class Testing4
{
    public static void main(String[] args) {
        Third obj=new Third(2,7,9,5);
    }

}
