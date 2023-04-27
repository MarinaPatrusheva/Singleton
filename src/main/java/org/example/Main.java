package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLog();
        Random random = new Random();
        int size;
        int max;
        int f;
        logger.log("Просим пользователя ввести входные данные для списка");
        logger.log("Введите размер списка:");
        size = scanner.nextInt();
        logger.log("Введите верхнюю границу для значений:");
        max = scanner.nextInt();
        logger.log("Введите входные данные для фильтрации");
        f = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        for(int i = 0; i < size; i++){
            list.add(random.nextInt(max));
        }
        Filter filter = new Filter(f);
        filter.filterOut(list);
    }
}