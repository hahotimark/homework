
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Dictionary {

    private ArrayList<String> wordHun = new ArrayList<>();

    private ArrayList<String> wordEng = new ArrayList<>();

    public void setWordEng(ArrayList<String> wordEng) {
        this.wordEng = wordEng;
    }

    public void setWordHun(ArrayList<String> wordHun) {
        this.wordHun = wordHun;
    }
}
