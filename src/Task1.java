public class Task1 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));
    }

    public static int remainder(int first, int second)
    {
        int remains = first % second; // остаток от деления first на second
        return remains;
    }
}
