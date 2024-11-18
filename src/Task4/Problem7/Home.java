package Task4.Problem7;

public class Home {
        private String table;
        private Room room;//composed object

        public Home(String table,int r){
            this.table=table;
            room=new Room(r);
        }

        void myHome(){
            System.out.println("My Home has 1 "+table);
            System.out.println("My home has "+room.getNum()+" rooms.");
        }

    }

