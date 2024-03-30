public class Person {
    public String name;
    public String surname;
    public int birthdate;

    public Person(String name, String surname, int birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public void show() {
        System.out.println(name + " " + surname +" " + birthdate);
    }
    }

