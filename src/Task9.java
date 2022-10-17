public class Task9 {
    public static void main(String[] args) throws Exception 
    {
        System.out.println(sumOfCubes(new int[]{1, 5, 9}));
        System.out.println(sumOfCubes(new int[]{3, 4, 5}));
        System.out.println(sumOfCubes(new int[]{2}));
        System.out.println(sumOfCubes(new int[]{}));
    }

    public static int sumOfCubes(int[] array)
    {
        int sum = 0; // сумма
        for (int i = 0; i < array.length; i++) // перебор всех числе в массиве
        { 
            sum += array[i] * array[i] * array[i]; // прибавление куба числа к сумме
        }
        return sum;
    }
}
