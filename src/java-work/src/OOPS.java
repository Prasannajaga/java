public class OOPS{
    public static void main(String[] args) {

        Polymorphism p = new Polymorphism();
        System.out.println(p.show(1) + " " +  p.show(1 , 2));
        p.roar();


    }
}

class Polymorphism  extends Animal{


// compileTime polymorphism method overloading
    int show(int a ){
        return a + 1;
    }
    int show(int a , int b){
        return a + b;
    }

//  runtime polymorphism method overriding
    @Override
    void roar(){
        System.out.println("Tiger is beautiful");
    }


}
class Animal {

    void roar(){
        System.out.println("Lion roared");
    }
}


class Cars extends BMW {

    void accelerate(){

    }
}


abstract class BMW{

    abstract void accelerate();

    void run(){
        System.out.println("Car is runnning");
    }
}
