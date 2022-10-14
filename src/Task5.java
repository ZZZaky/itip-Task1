public class Task5 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(operation(24, 15, 9));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(15, 11, 11));
    }

    public static String operation(int N, int a, int b)
    {
        int sum = a + b; // сумма
        int sub = a - b; // вычитание
        int mul = a * b; // умножение
        int div = a / b; // деление

        if (sum == N) { return "added"; }
        else if (sub == N) { return "subtracted"; }
        else if (mul == N) { return "multiply"; }
        else if (div == N) { return "division"; }
        else { return "none"; }
    }
}
