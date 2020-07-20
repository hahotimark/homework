
public class StrReplacer {

    String name;

    String newText;

    String newText2;

    private String endText;

    public StrReplacer(String name, String newText){

        this.name = name;

        this.newText = newText;

    }

    public void replacer(){

        newText2 = this.newText.replace(" ", "");

        endText = this.name.replaceAll(" ", this.newText2);

        System.out.println(endText);

    }

}
