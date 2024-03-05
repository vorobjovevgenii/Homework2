public class Person {
    String name;
    String surName;
    int age;
    String profession;
    Person() {

    }
    Person(String name, String surName, int age, String profession){
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    String getFullName (){
        return (surName + " " + name);
    }

    void printAgeGroup(){
        if (age < 12) {
            System.out.print("Детство");
        }
        else if (age <= 17) {
            System.out.print("Юность");
        }
        else if (age <= 44) {
            System.out.print("Молодость");
        }
        else if (age <= 59) {
            System.out.print("Зрелость");
        }
        else if (age <= 74) {
            System.out.print("Пожилой человек");
        }
        else if (age <= 90) {
            System.out.print("Старость");
        }
        else {
            System.out.print("Долгожительство");
        }
    }
}

/*
public class Person {
    String name;
    String surname;
    String profession;
    int age;

    Person() {
    }

    Person(String name, String surname, String profession, int age) {
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.age = age;
    }

    String getFullName() {
        String FullName = "Полное имя:" + name + " " + surname;
        return FullName;

    }
void printAgeGroup() {
        String strGroup = "";
        if (this.age < 12) {
            strGroup = "Детство";
        } else if (this.age >= 13 && this.age <= 17) {
            strGroup = "Юность";
        } else if (this.age >= 18 && this.age <= 44) {
            strGroup = "Молодость";
        } else if (this.age >= 45 && this.age <= 59) {
            strGroup = "Зрелость";
        } else if (this.age >= 60 && this.age <= 74) {
            strGroup = "Пожилой возраст";
        } else if (this.age >= 75 && this.age <= 90) {
            strGroup = "Старость";
        } else {
            strGroup = "Долгожительство";
        }

        System.out.println(strGroup);
    }

}
 */