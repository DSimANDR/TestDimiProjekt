public class Main
{
    public static void main(String[] args)
    {
//        Car fahrzeug1 = new Car();
//        fahrzeug1.colour = "green";
//        fahrzeug1.manufacturer = "Volkswagen";
//        fahrzeug1.horsePower = 95;
//        fahrzeug1.model = "Beast";
//
//        Car fahrzeug2 = new Car();
//        fahrzeug2.colour = "rot";
//        fahrzeug2.manufacturer = "Porsche";
//        fahrzeug2.horsePower = 300;
//        fahrzeug2.model = "Monster";
//
//        Car fahrzeug3 = new Car();
//        fahrzeug3.colour = "schwarz";
//        fahrzeug3.manufacturer = "BMW";
//        fahrzeug3.horsePower = 260;
//        fahrzeug3.model = "BadMobil";

        Person Person1 = new Person();
        Person Person2 = new Person();
        Person Person3 = new Person();
        Person Person4 = new Person();

        Person1.age = 18;
        Person1.firstName = "Dimi";
        Person1.lastname = "Simic";
        Person2.age = 20;
        Person2.firstName = "Chris";
        Person2.lastname = "StarkerMann";
        Person3.age = 35;
        Person3.firstName = "Jan";
        Person3.lastname = "GroßerMann";

//        printPerson(Person1);
//        printPerson(Person2);
//        printPerson(Person3);
        Person1.print();
        Person2.print();
        Person3.print();

    }
    public static void printPerson(Person p){
        System.out.println(p.firstName + " " + p.lastname + " " + p.age + " Jahre");
    }
}
