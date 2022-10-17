public class Task6 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));
    }

    public static int ctoa(char symbol)
    {
        return symbol; // получаем ascii символа
    }
}
