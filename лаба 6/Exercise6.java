import java.util.Scanner;

public class Exercise6 {
    public void first(){
        System.out.println("Виведення від 1 до 10 доллларів США в гривні : ");
        int i = 1;
        while (i <= 10){
            System.out.println(i + "$ = " + (i*39) + "грн.");
            i++;
        }
    }

    public void second(){}
    public void third(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть n кількість цілих чисел: ");
        int n = scan.nextInt();
        int sum = 0;
        while (n > 0){
            System.out.println("Введіть натуральне число (лишилось " + n + " чисел): ");
            sum += scan.nextInt();
            n--;
        }
        System.out.println("Сума: " + sum);
    }
    public void fourth(){
        Scanner scan = new Scanner(System.in);
        int min, max, num;
        System.out.println("Введіть число: ");
        num = scan.nextInt();
        min = num;
        max = num;
        while(num != 0) {
            if (min > num) {
                min = num;
            }
            if (max < num){
                max = num;
            }
            System.out.println("Введіть число: ");
            num = scan.nextInt();
        }
        System.out.println("Різниця між максимальним і мінімальним значенням чисел: " + (max-min));
    }
    public void fifth(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть n: ");
        int n = scan.nextInt();
        int amount = 0;
        int sum = 0;
        int num;
        while (true){
            System.out.println("Введіть число не більше " + n);
            num = scan.nextInt();
            if (num > n){
                break;
            }
            if (num > 0){
                sum += num;
                amount++;
            }
        }
        double average = (double) sum/amount;
        System.out.println("Середнє: " + average);
    }
    public void six(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість екзаменаційних оцінок: ");
        int n = scanner.nextInt();
        double sum = 0;
        int countFive = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введіть оцінку " + (i+1) + " з " + n);
            int grade = scanner.nextInt();
            if (grade == 5) {
                countFive++;
            }
            sum += grade;
        }
        double avg = sum / n;
        System.out.printf("Середня оцінка: %.2f \n", avg);
        System.out.printf("Кількість п'ятірок: %d", countFive);
    }
}
