import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        int max = 3;
        int min = 1;
        int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра \"Сломай Блок\"");
        System.out.println("Что бы сломать блок перед тобой используй инструмент на выбор:");
        System.out.println("Кирка|Лопата|Меч");
        System.out.println("Готов?");
        System.out.println("Да/Нет");
        String Start = scanner.next();
        if (Start.equals("Да")) System.out.println("Первый Блок");
        else {System.out.println("А мне Похуй))");
            System.out.println("Первый Блок)");}
    switch (randomBlock) {
        case 1 -> {
            System.out.println("Перед тобой Глина");
            String Tool = scanner.next();
            switch (Tool) {
                case "Лопата", "лопата", "ЛОПАТА" -> score += 1;
                default -> System.out.println("Анлак");}}
        case 2 -> {
            System.out.println("Перед тобой Камень");
            String Tool = scanner.next();
            switch (Tool) {
                case "Кирка", "кирка", "КИРКА" -> score += 1;
                default -> System.out.println("Анлак");}}
        case 3 -> {
            System.out.println("Перед тобой Паутина");
            String Tool = scanner.next();
            switch (Tool) {
                case "Меч", "меч", "МЕЧ" -> score += 1;
                default -> System.out.println("Анлак");}}}
        System.out.println("Второй Блок");
        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
    switch (randomBlock){
            case 1 -> {
                System.out.println("Перед тобой Глина");
                String Tool = scanner.next();
                switch (Tool) {
                    case "Лопата", "лопата", "ЛОПАТА" -> score += 1;
                    default -> System.out.println("Анлак");}}
            case 2 -> {
                System.out.println("Перед тобой Камень");
                String Tool = scanner.next();
                switch (Tool) {
                    case "Кирка", "кирка", "КИРКА" -> score += 1;
                    default -> System.out.println("Анлак");}}
            case 3 -> {
                System.out.println("Перед тобой Паутина");
                String Tool = scanner.next();
                switch (Tool) {
                    case "Меч", "меч", "МЕЧ" -> score += 1;
                    default -> System.out.println("Анлак");}}}
        System.out.println("Третий Блок");
        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
    switch (randomBlock){
            case 1 -> {
                System.out.println("Перед тобой Глина");
                String Tool = scanner.next();
                switch (Tool) {
                    case "Лопата", "лопата", "ЛОПАТА" -> score += 1;
                    default -> System.out.println("Анлак");}}
            case 2 -> {
                System.out.println("Перед тобой Камень");
                String Tool = scanner.next();
                switch (Tool) {
                    case "Кирка", "кирка", "КИРКА" -> score += 1;
                    default -> System.out.println("Анлак");}}
            case 3 -> {
                System.out.println("Перед тобой Паутина");
                String Tool = scanner.next();
                switch (Tool) {
                    case "Меч", "меч", "МЕЧ" -> score += 1;
                    default -> System.out.println("Анлак");}}}
        System.out.println("Ты набрал " + score + " Очков");
    }
}