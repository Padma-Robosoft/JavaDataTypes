package Task7.Problem4;
import java.util.*;

public class GameMain {
    public static void main(String[] args) {

        List<Token> tokenList = List.of(new Token(), new Token());
        Game game = new Game(tokenList);

        tokenList.get(0).setActive(false);

        System.out.println("Before reset:");
        for (Token token : tokenList) {
            System.out.println(token.isActive());
        }

        game.resetTokens();

        System.out.println("After reset:");
        for (Token token : tokenList) {
            System.out.println(token.isActive());
        }
    }

}
