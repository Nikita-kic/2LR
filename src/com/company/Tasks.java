package com.company;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Tasks {
    private static final Logger log = LoggerFactory.getLogger(Tasks.class);

    public void task1(int workingMode) throws FileNotFoundException {
        double x = 0;
        double result;

        System.out.println("Первая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите x ");
            x = scanner.nextInt();
        } else {
            try {
                String path = "src/1taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                x = scanner.nextInt();
                System.out.println("Ввод x из файла, x=" + x);
                scanner.close();
            } catch (IOException e) {
                System.out.println("Файл не найден или не открываается" + e);
                return;
            }
        }

        result = Math.sin(Math.sqrt(x + 1)) - Math.sin(Math.sqrt(x - 1));
        log.debug("~какая-то подробная ифнормация по первой задаче~");
        System.out.println("Результат равен " + result);
    }


    public void task2(int workingMode) throws FileNotFoundException {
        int x = 0;
        double result;

        System.out.println("Вторая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число x");
            x = scanner.nextInt();
        } else {
            try {
                String path = "src/2taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                x = scanner.nextInt();
                scanner.close();
                System.out.println("Ввод числа из файла, число равно " + x);
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
                return;
            }
        }

        result = -2 * x + 3 * Math.pow(x, 2) - 4 * Math.pow(x, 3);
        System.out.println("Результат первого выражения равен " + result);

        result = 1 + 2 * x + 3 * Math.pow(x, 2) + 4 * Math.pow(x, 3);
        System.out.println("Результат второго выражения равен " + result);
        log.info("~какая-то подробная ифнормация по второй задаче~");
    }

    public void task3(int workingMode) throws FileNotFoundException {
        int a = 0;
        int b = 0;
        int c = 0;
        int k = 0;

        System.out.println("Третья задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a ");
            a = scanner.nextInt();
            System.out.println("Введите b ");
            b = scanner.nextInt();
            System.out.println("Введите c ");
            c = scanner.nextInt();
            System.out.println("Введите k ");
            k = scanner.nextInt();
        } else {
            try {
                String path = "src/3taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                a = scanner.nextInt();
                System.out.println("Ввод a из файла, a=" + a);
                b = scanner.nextInt();
                System.out.println("Ввод b из файла, b=" + b);
                c = scanner.nextInt();
                System.out.println("Ввод c из файла, c=" + c);
                k = scanner.nextInt();
                System.out.println("Ввод из файла делителя k, k=" + k);
                scanner.close();
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
                return;
            }
        }

        if (a % k == 0)
            System.out.println("k является делителем a");
        if (b % k == 0)
            System.out.println("k является делителем b");
        if (c % k == 0)
            System.out.println("k является делителем c");
        if ((a % k != 0) && (b % k != 0) && (c % k != 0))
            System.out.println("k не является делителем a, b и c");

        log.warn("~какое-то предупреждение~");
    }

    public void task4(int workingMode) throws FileNotFoundException {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int x3 = 0;
        int y3 = 0;
        int x4 = 0;
        int y4 = 0;
        int s = 0;

        System.out.println("Четвёртая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Пусть x1,y1 это правый верхний угол прямоугольника,\n" +
                    "x2,y2 это правый нижний угол и т.д.");
            System.out.println("Введите x1 ");
            x1 = scanner.nextInt();
            System.out.println("Введите y1 ");
            y1 = scanner.nextInt();
            System.out.println("Введите x2 ");
            x2 = scanner.nextInt();
            System.out.println("Введите y2 ");
            y2 = scanner.nextInt();
            System.out.println("Введите x3 ");
            x3 = scanner.nextInt();
            System.out.println("Введите y3 ");
            y3 = scanner.nextInt();
            System.out.println("Введите x4 ");
            x4 = scanner.nextInt();
            System.out.println("Введите y4 ");
            y4 = scanner.nextInt();
        } else {
            try {
                String path = "src/4taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                x1 = scanner.nextInt();
                System.out.println("Ввод x1 из файла, x1=" + x1);
                y1 = scanner.nextInt();
                System.out.println("Ввод y1 из файла, y1=" + y1);
                x2 = scanner.nextInt();
                System.out.println("Ввод x2 из файла, x2=" + x2);
                y2 = scanner.nextInt();
                System.out.println("Ввод y2 из файла, y2=" + y2);
                x3 = scanner.nextInt();
                System.out.println("Ввод x3 из файла, x3=" + x3);
                y3 = scanner.nextInt();
                System.out.println("Ввод y3 из файла, y3=" + y3);
                x4 = scanner.nextInt();
                System.out.println("Ввод x4 из файла, x4=" + x4);
                y4 = scanner.nextInt();
                System.out.println("Ввод y4 из файла, y4=" + y4);
                scanner.close();
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
                return;
            }

            if ((x1 > 0) && (y1 > 0) && (x2 <= 0) && (y2 <= 0) && (x3 <= 0) && (y3 <= 0) && (x4 <= 0) && (y4 <= 0))
                s = x1 * y1;
            if ((x1 > 0) && (y1 > 0) && (x2 > 0) && (y2 > 0) && (x3 <= 0) && (y3 <= 0) && (x4 <= 0) && (y4 <= 0))
                s = x1 * y1 - (x1 - x2) * (y1 - y2);
            if ((x1 > 0) && (y1 > 0) && (x2 > 0) && (y2 > 0) && (x3 > 0) && (y3 > 0) && (x4 > 0) && (y4 > 0))
                s = x1 * y1 - (x1 - x4) * (y1 - y2);

            System.out.println("Вывод площади части прямоугольника" +
                    " расположенной в 1-й координатной четверти: " + s);
        }
    }

    public void task5(int workingMode) throws FileNotFoundException {
        int number = 0;

        System.out.println("Пятая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число для уточнения названия детали ");
            number = scanner.nextInt();
        } else {
            try {
                String path = "src/5taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                number = scanner.nextInt();
                System.out.println("Ввод числа для уточнения названия детали из файла " + number);
                scanner.close();
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
                return;
            }
        }

        switch (number) {
            case 1:
                System.out.println("Шуруп");
                break;
            case 2:
                System.out.println("Гайка");
                break;
            case 3:
                System.out.println("Винт");
                break;
            case 4:
                System.out.println("Гвоздь");
                break;
            case 5:
                System.out.println("Болт");
                break;
        }

        log.error("~какая-то ошибка~");
    }

    public void task6(int workingMode) throws FileNotFoundException {
        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthName = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        int day = 1;
        int i;

        System.out.println("Шестая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер дня");
            day = scanner.nextInt();
        } else {
            try {
                String path = "src/6taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                day = scanner.nextInt();
                System.out.println("Ввод номера дня из файла " + day);
                scanner.close();
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
                return;
            }
        }

        for (i = 0; day > month[i]; i++) {
            day -= month[i];
        }

        System.out.println(monthName[i] + " " + day);
    }

    public void task7(int workingMode) throws FileNotFoundException {
        double s = 0;
        int n = 0;
        double x = 0;
        int tmp = 0;

        System.out.println("Седьмая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество шагов n ");
            n = scanner.nextInt();
            System.out.println("Введите число x ");
            x = scanner.nextDouble();
        } else {
            try {
                String path = "src/7taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                n = scanner.nextInt();
                System.out.println("Ввод из файла количество шагов n " + n);
                x = scanner.nextDouble();
                System.out.println("Ввод из файла числa x " + x);
                scanner.close();
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
                return;
            }
        }

        for (int i = 1; i < n; i++) {
            s = -1 + Math.pow(x, i * 2) / fact(i);
        }

        System.out.println("Сумма всех n членов ряда равна: " + s);
    }

    private double fact(int N) {
        if (N < 0)
            return 0;
        if (N == 0)
            return 1;
        else
            return N * fact(N - 1);
    }

    public void task8(int workingMode) throws FileNotFoundException {
        String userLastname = "";

        System.out.println("Восьмая задача");

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите вашу фамилию ");
            userLastname = scanner.next();
        } else {
            try {
                String path = "src/8taskData.txt";
                Scanner scanner = new Scanner(new File(path));
                userLastname = scanner.next();
                System.out.println("Ввод из файла вашей фамилии " + userLastname);
                scanner.close();
            } catch (IOException e) {
                System.out.println("Файл не найден" + e);
                return;
            }
        }

        System.out.println("Печатаем вашу фамилию 10 раз:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Ввод из файла вашей фамилии " + userLastname);
        }

    }
}