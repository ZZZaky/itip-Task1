public class Task10 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }

    public static boolean abcmath(int a, int b, int c) 
    {
        for (int i = 0; i < b; i++) { a += a; } // a прибавится к себе b раз
        return (a % c == 0);
    }
}
