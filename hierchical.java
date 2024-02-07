class A{
    public void print(){
        System.out.println("class A method");
    }
}
class B{
    public void print(){
        System.out.println("class B method");
    }
}
class C{
    public void print(){
        System.out.println("class C method");
    }
}


public class hierchical {
    public static void main(String[] args) {
        B obj = new B();
        C obj1 = new C();
        obj.print();
        obj1.print();

        
    }
}
