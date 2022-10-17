public class Task8 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));
    }

    public static int nextEdge(int first, int second)
    {
        return (first + second - 1);
        // сторона треугольника меньше суммы двух других
        // если нам нужна максимальная сторона то берем сумму двух дргуих
        // и вычитаем 1
    }
}
