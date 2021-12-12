import java.util.Base64;

public class Simple {

    public int square(int x){
        return x*x;
    }

    public String base64(String input){
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        return encoded;
    }

}
