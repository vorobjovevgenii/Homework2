/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Введите имя - ");
        person.name = scanner.nextLine();
        System.out.print("Введите Вамилию - ");
        person.surName = scanner.nextLine();
        System.out.print("Введите професию - ");
        person.profession = scanner.nextLine();
        System.out.print("Введите возраст - ");
        person.age = scanner.nextInt();


        System.out.println(person.name + person.surName + person.profession + person.age);


    }
}


/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Введите имя - ");
        person.name = scanner.nextLine();
        System.out.print("Введите Вамилию - ");
        person.surName = scanner.nextLine();
        System.out.print("Введите возраст - ");
        person.age = scanner.nextInt();
        System.out.print("Введите професию - ");
        person.profession = scanner.nextLine();
        System.out.print(person.name + person.surName + person.age + person.profession);
    }
}
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person person = new Person("Евгений", "Петров", 38, "Учитель");

        System.out.println(person.getFullName());

        person.printAgeGroup();

    }
}

