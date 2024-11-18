package Task7.problem4;

    public class Token {
        private boolean isTokenActive;

        Token() //constructor
        {
            this.isTokenActive = true;
        }

        public void setTokenActive(boolean tokenActive) {
            isTokenActive = tokenActive;
        }


        public String toString() {
            return isTokenActive ? "Active" : "Inactive";
        }
    }

