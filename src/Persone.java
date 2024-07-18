import java.util.ArrayList;
import java.util.List;

public class Persone {

    List<Person> persone;

    public Persone(){
        this.persone = new ArrayList<>();
    }

    public List<Person> getPersone(){
        return persone;
    }

    @Override
    public String toString() {
        return "Persone{" +
                "persone=" + persone +
                '}';
    }
}
