import com.paveldejimas.bazine.ZmogusImpl;
import com.paveldejimas.isvestine.StatybininkasImpl;

public class Main {

    public static void main(String[] args) {
        //Sukuriami bazinės klasės objektai (tėvo)
        ZmogusImpl zmogus1 = new ZmogusImpl(true, "51002266251", "vardas", "pavarde", 20, 60, 180, "Juoda");
        ZmogusImpl zmogus2 = new ZmogusImpl(true, "51002266251", "vardas", "pavarde", 20, 60, 180, "Juoda");
        ZmogusImpl zmogus3 = new ZmogusImpl(true, "51002266251", "vardas", "pavarde", 20, 60, 180, "Juoda");
        ZmogusImpl zmogus4 = new ZmogusImpl(true, "51002266251", "vardas", "pavarde", 20, 60, 180, "Juoda");

        //Sukuriami išvestinės klasės objektai (vaiko)
        StatybininkasImpl statybininkas1 = new StatybininkasImpl(true, "51002266251", "vardas", "pavarde", 20, 60, 180, "Juoda", 16, "vidurinis", "statybininkas", 1000);
        StatybininkasImpl statybininkas2 = new StatybininkasImpl(true, "51002266251", "vardas", "pavarde", 20, 60, 180, "Juoda", 16, "vidurinis", "statybininkas", 1000);
        StatybininkasImpl statybininkas3 = new StatybininkasImpl(true, "51002266251", "vardas", "pavarde", 20, 60, 180, "Juoda", 16, "vidurinis", "statybininkas", 1000);
        StatybininkasImpl statybininkas4 = new StatybininkasImpl(true, "51002266251", "vardas", "pavarde", 20, 60, 180, "Juoda", 16, "vidurinis", "statybininkas", 1000);

        //Sudėsime vaiko, tėvo objektus į sarašą
        ZmogusImpl[] zmogai = new ZmogusImpl[8];
        zmogai[0] = zmogus1;
        zmogai[1] = zmogus2;
        zmogai[2] = zmogus3;
        zmogai[3] = zmogus4;
        zmogai[4] = statybininkas1;
        zmogai[5] = statybininkas2;
        zmogai[6] = statybininkas3;
        zmogai[7] = statybininkas4;

        //Atspausdinsim kiek uždirba statybininkai
        double suma = 0;
        /*
        for (int i=0;i<8;i++){
            //Jeigu sarašo elementas yra Statybininko objektas
            if (zmogai[i] instanceof StatybininkasImpl){
                //Kai randamas statybininkas mes jį išsitraukiame (atliekame konvertavima)
                StatybininkasImpl statybininkelis = (StatybininkasImpl) zmogai[i];
                //Suskaičiuojama kiek uždirba statybininkai
                suma += statybininkelis.getAtlyginimas();
            }
        }
         */
        for (ZmogusImpl zmogus : zmogai) {
            if (zmogus instanceof StatybininkasImpl) {
                //Kai randamas statybininkas mes jį išsitraukiame (atliekame konvertavima)
                StatybininkasImpl statybininkelis = (StatybininkasImpl) zmogus;
                //Suskaičiuojama kiek uždirba statybininkai
                suma += statybininkelis.getAtlyginimas();
            }
        }
        System.out.println("Statybinkai uždirba viso: " + suma);
    }
}
