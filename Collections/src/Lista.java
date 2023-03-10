import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> lista = new ArrayList<Person>();
        Person pessoa1 = new Person("João", "Silva", "32145698725", 35);
        Person pessoa2 = new Person("Maria", "Silva", "32145158725", 35);
        Person pessoa3 = new Person("Ricardo", "Faria", "8539698725", 55);

        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(0, pessoa3);
        

        lista.forEach((i) -> System.out.println(i.completeName()));
    }
}

class Person{
    private String name;
    private String lastName;
    private String cpf;
    private int age;

    public Person(String name, String lastLame, String cpf, int age) {
        this.name = name;
        this.lastName = lastLame;
        this.cpf = cpf;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", lastLame=" + lastName + ", cpf=" + cpf + ", age=" + age + "]";
    }

    public String completeName(){
        return (this.name + " "+ this.lastName);
    }
}
