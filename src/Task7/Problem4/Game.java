package Task7.Problem4;

import java.util.List;

public class Game {
    private List<Token> tokens;

    public Game(List<Token> tokens){
        this.tokens=tokens;
    }

    public void resetTokens(){
        for(Token token: tokens){
            token.setActive(true);
        }
    }
}
