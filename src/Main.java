import com.paveldejimas.bazine.ZmogusImpl;

public class Main {

    public static void main(String[] args) {
        ZmogusImpl zmogus = new ZmogusImpl(true, "51002266251", "vardas", "pavarde", 20, 60, 180, "Juoda");
        zmogus.toString();
    }
}
