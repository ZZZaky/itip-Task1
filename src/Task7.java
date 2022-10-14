public class Task7 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));
    }

    public static int addUpTo(int number)
    {
        int sum = 0; // сумма
        for (int i = 1; i <= number; i++) { sum += i; } // перебор всех чисел и их суммирование
        return sum;
    }
}
