import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        String Tool;
        int block = 1;
        int max = 3;
        int min = 1;
        // int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("                    Игра \"Сломай Блок\"");
        System.out.println("Что бы сломать блок перед тобой используй инструмент на выбор:");
        System.out.println("                    Кирка|Лопата|Меч");
        System.out.println("                          Начать?");
        System.out.println("                          Да/Нет");
        String Start = scanner.next();
        switch (Start) {
            case "Да" : while (block < 4 ) {
                System.out.println("Перед тобой "+block+" Блок");
                block++;
                int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
                switch (randomBlock) {
                    case 1 -> {
                        System.out.println("Перед тобой Глина");
                        Tool = scanner.next().toLowerCase();
                        if (Tool.equals("лопата")) {
                            score++;} else {
                            System.out.println("Анлак");}}
                    case 2 -> {
                        System.out.println("Перед тобой Камень");
                        Tool = scanner.next().toLowerCase();
                        if (Tool.equals("кирка")) {
                            score++;} else {
                            System.out.println("Анлак");}}
                    case 3 -> {
                        System.out.println("Перед тобой Паутина");
                        Tool = scanner.next().toLowerCase();
                        if (Tool.equals("меч")) {
                            score++;} else {
                            System.out.println("Анлак");}}}}
                System.out.println("Ты набрал " + score + " Очков");
            case "Нет" : break;
            default:{
                System.out.println("Ошибка, программа закрывается.");
                break;}
        }
    }
}