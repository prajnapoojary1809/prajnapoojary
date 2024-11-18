package Task7.problem4;

    public class Problem4 {
        public static void main(String[] args) {
            Player p = new Player();
            p.createTokenList(5);
            p.showTokens();
            p.setTokensInactive(3);
            p.setTokensInactive(0);
            p.showTokens();
            p.resetTokens();
            p.showTokens();
        }
    }
