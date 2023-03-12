public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int count = 0;
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        System.out.println("Сумма выплат составила " + count);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int minn = 10000000;
        for (int i : arr) {
            if (i < minn){
                minn = i;
            }
        }
        System.out.println("Минимальная сумма "+ minn);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int count = 0;
        float avrgSum = 0;
        for (int i : arr) {
            count+=i;

        }
        avrgSum =  count/30;
        System.out.println(avrgSum);}
        public static void task4 () {
            System.out.println("Задача 4");

            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for(int i = reverseFullName.length -1 ; i >= 0; i--){
                System.out.print(reverseFullName[i]);
            }

        }
    }
    