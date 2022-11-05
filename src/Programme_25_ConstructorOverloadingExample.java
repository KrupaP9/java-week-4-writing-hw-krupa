public class Programme_25_ConstructorOverloadingExample {
    //Java program to overload constructors
    int id;
    String name;
    int age;

    //creating two arg constructor
    Programme_25_ConstructorOverloadingExample(int i, String n){
        this.id = i;
        this.name = n;
    }
    //creating three arg constructor
    Programme_25_ConstructorOverloadingExample(int i, String n, int a){
        this.id=i;
        this.name=n;
        this.age=a;
    }
    public void display(){
        System.out.println(id+" "+name + " "+ age);
    }
    public static void main (String[] args){
        Programme_25_ConstructorOverloadingExample s1= new Programme_25_ConstructorOverloadingExample(111,"Karan");
        Programme_25_ConstructorOverloadingExample s2 = new Programme_25_ConstructorOverloadingExample(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}
