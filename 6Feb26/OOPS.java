public class OOPS {
    public static void main(String[] args) {
        
        G35 g = new G35();
        G35Child gChild = new G35Child();
        g.dsa();
        gChild.java();
        gChild.students();

    }
}

class G35{
    void students(){
        System.out.println("there are 70 students");
    }
    void dsa(){
        System.out.println("we are learning DSA");
    }
}

class G35Child extends G35{
   
    void java(){
        System.out.println("we are learning DSA using java");
    }
}
