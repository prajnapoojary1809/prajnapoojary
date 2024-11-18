package Task9.Problem2;

    public class Pair <T,U>{
        private T name;
        private U id;
        public Pair(){

        }
        public U getId() {
            return id;
        }

        public void setId(U id) {
            this.id = id;
        }

        public T getName() {
            return name;
        }

        public void setName(T name) {
            this.name = name;
        }
        public String toString() {
            return this.id + " + " + this.name + "marc";
        }
    }

