package Task7.Problem4;
import java.util.*;

public class GameMain {
    public static void main(String[] args) {

        Player p = new Player();
        p.createTokenList(5);
        p.showTokens();

        p.setTokensInactive(4);
        p.setTokensInactive(1);
        p.showTokens();

        p.resetTokens();
        p.showTokens();

        p.setTokensInactive(3);
        p.showTokens();
    }
}




