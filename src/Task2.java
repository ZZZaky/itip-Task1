public class Task2 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));
    }
    
    public static int triArea(int base, int height)
    {
        int area = (base * height) / 2; // площадь треугольника = основание * высоту / 2
        return area;
    }
}
