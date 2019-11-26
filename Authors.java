
package library;

public class Authors {
    public static void main(String[] args) {
         Book bk[]=new Book[4]; 
         bk[0]= new Book("java","eer","tt");
         bk[1]= new Book("Network","eee","yyy");
         bk[2]= new Book("Web Design","rrty","rty");
         bk[3]= new Book("Physic","ee","44");
        
         Author a=new Author(bk);
         System.out.println("Book of Author");
         a.getBook();
   
    }
}
