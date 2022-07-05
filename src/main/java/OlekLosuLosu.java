import java.util.ArrayList;
import java.util.Random;

public class OlekLosuLosu<olek> {

    public String haslo(){

     ArrayList<String> olek = new ArrayList<>();

        olek.add("huh");
        olek.add("ygh");
        olek.add("huh");
        olek.add("mhm");
        olek.add("ŁEEEEH");
        olek.add("Nie moja wina tak?");
        olek.add("niby skąd?");
        olek.add("możesz wytłumaczyć");
        olek.add("skąd miałem wiedzieć?");
        olek.add("a no tak pan mądry");
        olek.add("sam nie jesteś lepszy");
        olek.add("nagle wszyscy tacy mądrzy");
        olek.add("wiadomo");
        olek.add("nie oszukujmy się");
        olek.add("humor jak Majstra");
        olek.add("zresztą");
        olek.add("ex xD");
        olek.add("jak Ty się nigdy nawet nie biłeś");
        olek.add("nie skojarzyłem tak?");
        olek.add("nie wiem czy w piątek dam radę");
        olek.add("a co takiego niby robisz?");
        olek.add("mało o mnie wiesz");
        olek.add("aaaaaaaaaaaaaaa");



    Random random = new Random();

        for(int i=0; i < olek.size(); i++){
        olek.get(random.nextInt(olek.size()));
    }
    int randomIndex = (int) (Math.random() * olek.size());
        return olek.get(randomIndex);

    }
}
