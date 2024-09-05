
/// single level inheretence

// class Shape{
//     public void area(){
//         System.out.println("distance of area");
//     }
// }
// class Triangle extends Shape{
//     public void area(int l, int h){
//         System.out.println(l*h);
//     }

// }
// class oops{
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.area(2,4);

//     }
// }


// multi level inheritance

// class Shape{
//     public void area(){
//         System.out.println("distance of area");
//     }
// }
// class Triangle extends Shape{
//     public void area(int l, int h){
//         System.out.println(l*h);
//     }

// }
// class Eqtriangle extends Triangle{
//     public void area(int l,int h){
//         System.out.println(l*h);
//     }
// }


// class oops{
//     public static void main(String[] args) {
//         Eqtriangle t1 = new Eqtriangle();
//         t1.area(2,4);

//     }
// }



// hierarchial inheratence

class Shape{
    public void area(){
        System.out.println("distance of area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(l*h);
    }

}
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


class oops{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area(2);

    }
}