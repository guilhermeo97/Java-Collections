import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class Sets {
    public static void main(String[] args){
        ArrayList<Person> lista = new ArrayList<Person>();

        Set<String> conjunto = new HashSet<String>();
        conjunto.add("batata");
        conjunto.add("cenoura");
        conjunto.add("carne");
        conjunto.add("arroz");

        //iterador verifica se existe um próximo objeto e consome ele.
        Iterator iterador =  conjunto.iterator();
    
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }

        if(conjunto.contains("batata")){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
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
