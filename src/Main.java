public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    //Задание 1
    public static void main(String[] args) {
        int[] salaries = generateRandomArray() ;
        int total = 0;
        for (int i = 0; i < salaries.length; i++) {
            total=total+salaries[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");

        //Задание 2

        int maxSalary=salaries[0];
        int minSalary=salaries[0];
        for (int i = 0; i < salaries.length; i++) {
            if (maxSalary < salaries[i]) {
                maxSalary = salaries[i];
            }
            if (minSalary>salaries[i]){
                minSalary=salaries[i];
            }
        }
        System.out.println("Максимальная зарплата за месяц: " + maxSalary + "рублей.");
        System.out.println("Минимальная зарплата за месяц: " + minSalary + "рублей.");

        //Задание 3

        double averageSalary = 0;
        for (int i = 0; i < salaries.length; i++) {
            averageSalary=total/30;
        }
        System.out.println("Средняя сумма трат за месяц составила:" + averageSalary + "рублей.");

        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}