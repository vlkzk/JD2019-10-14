package by.it.kharitonenko.jd01_02;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        step1();

        int month = scanner.nextInt();
        step2(month);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        step3(a, b, c);
    }

    static void step1() {
        int[] mas = new int[25];
//        int tempNumber = 1;
        //creating values
        for (int i = 0; i < mas.length; i++) {
            mas[i] = i + 1;
        }

        //main draw loop
        for (int element :
                mas) {
            //check for new line
            if (element%5 == 0) {
                System.out.println(element);
                System.out.println();
            }
            else
            //draw loop
            System.out.print(element + " ");
        }
    }

    static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("нет такого месяца");

        }
    }

    static void step3(double a, double b, double c) {
        double dis =  b * b - 4 * a * c;
        if(dis < 0) {
            System.out.println("корней нет");
        }
        if (dis == 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
    }

}
