/**
 * Created by Riddhi Sharma on 1/21/2017.
 */
public class B extends A {
    public B(){}
    @Override
    public int doString(String value)
    {
        int fromSuper= super.doString(value);
        return fromSuper+2;
    }
public static void main(String []args)
{
    A a =new A();
    System.out.println("A#doString(\"foo\"):"+a.doString("foo"));
    a =new B();
    System.out.println("B#doString(\"foo\"):"+a.doString("foo"));
}
}
