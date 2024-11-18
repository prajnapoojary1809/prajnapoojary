package Task6.Problem2;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static void filterBookByAuthorAge(ArrayList<Book> arrBook,int ageLimit){
        List<Book> filteredBooks=arrBook.stream().filter(book -> book.getAuthor().getAge()>ageLimit).toList();
        for(Book b: filteredBooks) {
            System.out.println(b.getId());
            System.out.println(b.getTitle());
            System.out.println(b.getAuthor().getName());
            System.out.println(b.getAuthor().getAge());
        }
    }
    public static void countBooksByAuthorAgeRange(ArrayList<Book> arrBook,int minAge,int maxAge){
        int counter = 0;
        for(Book b : arrBook) {
            if(b.getAuthor().getAge() >=minAge && b.getAuthor().getAge() <=maxAge)
                counter++;
        }
        System.out.println("Count of books is: " +counter);
    }

    public static void main(String[] args) {
        ArrayList<Book> arrBook=new ArrayList<>();
        Book book1=new Book(1,"Java Programming", "Alice Smith",34);
        Book book2=new Book(2,"Python Basics","Bob Jones",45);
        arrBook.add(book1);
        arrBook.add(book2);

        filterBookByAuthorAge(arrBook,40);
        countBooksByAuthorAgeRange(arrBook,20,40);

    }


}
