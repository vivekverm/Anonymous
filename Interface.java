interface V1
{
    public static final int a=23;
    public abstract void m1();
}
class one implements V1
{
    @Override
    public void m1()
    {
        System.out.println("Java programmer");
    }
}

public class Testing3
{
    public static void main(String[] args) {
        one obj2=new one();
        V1 obj=new V1() {
            @Override
            public void m1()
            {
                System.out.println("Welcome to java programmer");
            }
        };
       obj.m1();
       obj2.m1();
    }
}
