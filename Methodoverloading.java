class Methodoverloading
{
void sum (int a, int b)
{
System.out.println("sum is "+(a+b));
}
void sum (float a, float b)
{
System.out.println("sum is "+(a+b));
}
public static void main(String a[])
{
Methodoverloading cal = new Methodoverloading();
cal.sum(6,5);
cal.sum(14.2f,3.9f);
}
}

