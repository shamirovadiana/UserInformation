import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя :");
        String name = scanner.nextLine();
        System.out.println("Введите свою фамилию :");
        String surname = scanner.nextLine();
        System.out.println("Введите свой возраст :");
        String age = scanner.nextLine();
        System.out.println("Где Вы родились ?");
        String hometown = scanner.nextLine();
        System.out.println("В каком городе живёте сейчас ?");
        String currentLocation = scanner.nextLine();
        System.out.println("Какое у Вас хобби ?");
        String hobby = scanner.nextLine();
        System.out.println("Какие учебные заведения Вы окончили ?");
        String educationalBackground = scanner.nextLine();
        System.out.println("Кем работаете сейчас ?");
        String profession = scanner.nextLine();

        System.out.println("Ваши данные :\n");
        System.out.println("Ваше имя : " + name + "\n" +
                "Фамилия : " + surname + "\n" +
                "Возраст : " + age + "\n" +
                "Место рождения : " + hometown + "\n" +
                "Текущее местоположение : " + currentLocation + "\n" +
                "Хобби : " + hobby + "\n" +
                "Оконченные учебные заведения : " + educationalBackground + "\n" +
                "Работа : " + profession);

    }
}
