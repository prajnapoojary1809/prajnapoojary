package Task7.problem4;

import java.util.ArrayList;

    public class Player {
        private ArrayList<Token> tokenList = new ArrayList<>();

        public void createTokenList(int noOfTokens) {
            for (int i=0;i<noOfTokens;i++) {
                tokenList.add(new Token());
            }
        }
        public void showTokens() {
            System.out.println(tokenList.toString());
        }

        public void setTokensInactive(int idx) {
            tokenList.get(idx).setTokenActive(false);
        }

        public void resetTokens() {
            tokenList.stream().forEach((t->t.setTokenActive(true)));
        }
    }

