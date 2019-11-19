
package library;

public class Teachers extends Person{
   Teachers (String Firstname,String Lastname,String ID,String Takebook){
        super(Firstname,Lastname,ID,Takebook);
    }
    public void show(){
        System.out.println("Teachers Detail:");
        super.show();
}
    public static void main(String[] args) {
        Teachers t=new Teachers("Alexander","java","2","7 books");
        t.show();
    }
}