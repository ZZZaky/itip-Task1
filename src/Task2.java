public class Task2 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
    }
    
    public static double triArea(int base, int height)
    {
        return ((base * height) / 2); // площадь треугольника = основание * высоту / 2
    }
}
