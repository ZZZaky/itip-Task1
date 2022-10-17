public class Task4 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));
    }

    public static boolean profitableGamble(double prob, int prize, int pay)
    {
        return ((prob * prize) > pay); // true если больше, false если меньше
    }
}
