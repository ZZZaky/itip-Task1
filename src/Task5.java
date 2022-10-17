public class Task5 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
    }

    public static String operation(int N, int a, int b)
    {
        if ((a + b) == N) { return "added"; } // сумма
        else if ((a - b) == N) { return "subtracted"; } // вычитание
        else if ((a * b) == N) { return "multiply"; } // умножение
        else if ((a / b) == N) { return "division"; } // деление
        else { return "none"; } // никак не сравнять
    }
}
