package Task4.Problem6;

    public class Book {
        private String title;
        private String author;
        private float price;

        Book(){//default constructor
            String title="Atomic Habits";
            String author="James Clear";
            float price=500;
            System.out.println("Title:"+title+"\n"+"Author:"+author+"\n"+"Price:"+price);
        }
        Book(String title,String author,float price){//parameterised constructor
            this.title=title;
            this.author=author;
            this.price=price;
        }

        public String getTitle(){//accesing private variable using get()
            return title;
        }
        public String getAuthor(){//accesing private variable using get()
            return author;
        }
        public float getPrice(){//accesing private variable using get()
            return price;
        }
    }

