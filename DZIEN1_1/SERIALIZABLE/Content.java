import java.io.Serializable;

public class Content implements Serializable {
    int i;
    String s;

    public Content(int i, String s) {
        this.i = i;
        this.s = s;
    }
}
