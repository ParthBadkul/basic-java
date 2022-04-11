package parth;
class gta{
    int y;
    int lety(){
       return  y=100;
    }

}
interface g{
    void fun1();
    void fun2();
}
class gta6 extends gta implements g
{
public void fun1(){
    System.out.println("I am Having fun");
}
public void fun2(){
    System.out.println("Speeeed");

}


}

public class hey {
    public static void main(String[] args) {
        gta6 p=new gta6();
        p.fun1();
        System.out.println(p.lety());        
    

        
    }
    
}
