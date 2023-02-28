import java.util.Scanner;

public class exercise4 {
    public void first(int a, int b, int c){
        int average = (a+b+c)/3;
        if (average >= 90 && average <= 100){
            System.out.println("Стипендія підвищенна - 1790 грн :)");
        } else if (average >= 70){
            System.out.println("Стипендія звичайна - 1400 грн -_-");
        } else {
            System.out.println("Ти не пройшов на стєпуху :( ");
        }
    }

    public void second(int x, int y){
        if (x < 0 && y < 0){
            System.out.println(Math.abs(x) + " " + Math.abs(y));
        } else if ((x > 0 && y < 0) || (x < 0 && y > 0)){
            System.out.println((x+1) + " " + (y + 1));
        } else if ((x >= 2 && x <= 9) && (y >= 2 && y <= 9)){
            System.out.println((x - 10*x) + " " + (y - y*10));
        } else {
            System.out.println(x + " " + y);
        }
    }

    public void third(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть першу сторону: ");
        int a = scan.nextInt();
        System.out.println("Введіть другу сторону: ");
        int b = scan.nextInt();
        System.out.println("Введіть третю сторону: ");
        int c = scan.nextInt();
        if (isValidTriangle(a, b, c)) {
            System.out.println("Трикутник можливо побудувати");
            if (a == b && b == c) {
                System.out.println("Трикутник рівносторонній");
            } else if (a == b || b == c || a == c) {
                System.out.println("Трикутник рівнобедрений");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
                System.out.println("Трикутник прямокутний");
            } else {
                System.out.println("Трикутник довільний");
            }
        } else {
            System.out.println("Трикутник неможливо побудувати");
        }
    }
    private boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c && b + c > a && c + a > b);
    }

    public void fourth(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число:");
        int x = scan.nextInt();

        while (x <= 1000 || x >9999) {
            System.out.println("Введіть число від 1000 до 9999 :");
            x = scan.nextInt();
        }
        System.out.println("Число паліндром? : " + isPalindrome(x));
    }
    private boolean isPalindrome(int x) {
        if(x<0) return false;
        int temp = x;
        int sum = 0;
        while(x!=0){
            sum=(sum*10)+(x%10);
            x = x/10;
        }
        return (temp == sum);
    }

    public void fifth(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть місяць цифрою:");
        int x = scan.nextInt();

        switch (x) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 days");
            case 2 -> System.out.println("28 days");
            case 4, 6, 9, 11 -> System.out.println("30 days");
            default -> System.out.println("Invalid number!");
        }
    }

    public void sixth(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть вік від 20 до 69: ");
        int age = scan.nextInt();
        if (age < 20 || age > 69){
            System.out.println("Неправильний вік");
        } else {
            System.out.println(age + " " + ending(age));
        }

    }

    private String ending(int age){
        int temp = age;
        temp %= 10;
        if (temp == 1) {
            return "рік";
        } else if (temp >=2 && temp <= 4){
            return "роки";
        } else {
            return "років";
        }
    }
}
