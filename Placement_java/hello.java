//method overloading , compile time polymorphism
// class A{
//     int add(int a, int b){
//         int c = a+b;
//         return c;
//     }
//     int add(int a, int b, int c){
//         int d = a + b + c;
//         return d;
//     }
// }
// public class hello{
//     public static void main(String[]args){
//         System.out.println("Jai Shree Ram");
//         A obj = new A();
//         System.out.println(obj.add(2, 7, 4));
//         System.out.println(obj.add(2, 7));
//     }
// }

//method overriding .. run time polymorphism
// class A{
//    public void show(){
//     System.out.println("class A method");
//    }
// }
// class B extends A{
//    public void show(){
//         System.out.println("Class B method");
//     }
// }
// class C extends B{
//     public void show(){
//         System.out.println("Class C method");
//     }
// }
// public class hello{
//     public static void main(String[]args){
//         System.out.println("Jai Shree Ram");
//          A obj = new C();
//         obj.show();
//     }
// }



class A{
   static int a = 0;
        static{
            a++;
            System.out.println(a);
            a++;
        }

}
class B{
    static void show(){
       static int a = 0;
        a++;
        System.out.println(a);
        
    }
}
public class hello{
    public static void main(String[]args){
        System.out.println("Jai Shree Ram");
        // System.out.println("static varible of class A: "+A.a);
        B.show();
    }
}

