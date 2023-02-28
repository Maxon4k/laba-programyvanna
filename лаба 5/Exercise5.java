import java.util.Scanner;

public class Exercise5 {
    public void first(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число для виведення квадрату в стовпець: ");
        int a = scan.nextInt();
        for (int i = 10; i < a; i++) {
            System.out.println(i*i);
        }
    }
    public void second(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число для виведення таблички множення: ");
        int a = scan.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " * " + a + " = " + (i*a));
        }
    }
    public void third(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число a:");
        int a = scan.nextInt();
        System.out.println("Введіть число b:");
        int b = scan.nextInt();
        System.out.println("Введіть крок h:");
        int h = scan.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = a; i <= b; i+=h) {
            sum += i;
            count++;
        }
        double average = (double)sum/count;
        System.out.println("Середнє є: " + average);
    }
    public void fourth(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть 2 числа для знаходження їх множення: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= b; i++) {
            sum += a;
            System.out.println(i + " * " + a + " = "  + sum);
        }
    }
    public void fifth() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число щоб піднести до степеня:");
        int n = scan.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += (2 * i - 1);
        }
        System.out.println(n + "^2 = " + result);
    }

    public void sixth(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть a та b:");
        int a,b;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("Числа кратні 3 і не кратні 5: " + countMultiples(a, b)
                + "\nЧисла які є квадратами парних чисел: " + countSquarePairs(a, b));
    }
    public int countMultiples(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                count++;
            }
        }
        return count;
    }
    public int countSquarePairs(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (Math.sqrt(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
