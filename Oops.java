/// creation of class and objects



// class Student{
//     String name;
//     double marks;                 // they gives properties.
//     int age;



//     // the methods gives the functionalaties...
//     public void Name(){

//         System.out.println(this.name);
        
//     }

//     public void Marks(){
//         System.out.println(this.marks);
//     }

//     public void Age(){
//         System.out.println(this.age);
//     }

// }



// public class Oops {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name="kaif";
//         s1.marks=76.97;
//         s1.age=23;


//         Student s2 = new Student();
//          s2.name="tom";
//          s2.marks=90;
//          s2.age=20;

//         s1.Name();
//         s1.Marks();
//         s1.Age();


//         s2.Name();
//         s2.Marks();
//         s2.Age();

//     }

    
// }


// class Cars{
//     String name;
//     String engin;
//     int seats;
//     String fuel;


//     public void Name(){
//         System.out.println(this.name);
//     }
//     public void Engin(){
//         System.out.println("     "+this.engin);
//     }
//     public void Seater(){
//         System.out.println("     "+this.seats);
//     }
//     public void Fuel(){
//         System.out.println("     "+this.fuel);
//     }

//  // this.name is objects age  where as name is from the parameter... 
//     Cars(String name ,String engin,int seats,String fuel){

//         this.name=name;
//         this.engin=engin;
//         this.seats=seats;
//         this.fuel=fuel;
//     }


//     /// example of copy constructors....
//     Cars(Cars GT){

//         this.name=GT.name;
//         this.engin=GT.engin;
//         this.seats=GT.seats;
//         this.fuel=GT.fuel;
//     }

// }

// class Pro{
//     public static void main(String[] args) {
// //////// creating object 1
//         Cars Audi = new Cars("audi","V8",4,"petrol");
//         Audi.Name();
//         Audi.Engin();
//         Audi.Seater();
//         Audi.Fuel();
// //// creating object 2 and is an example of copy constructor hence it is copying the obj 1's constructor parameters
//         Cars GT = new Cars(Audi);
//         GT.Name();
//         GT.Engin();
//         GT.Seater();
//         GT.Fuel();
        
//     }
// }


class City{
    String name;
    String area;
    int population;

    public  void Name(){
        System.out.println(this.name);
    }

    public  void Area(){
        System.out.println(this.area);
    }

    public void Population(){
        System.out.println(this.population);
    }


    City(String name,String area,int population){
        this.name=name;
        this.area=area;
        this.population=population;
    }
}

class Pro{
    public static void main(String[] args) {
        City C1 = new City("bengaluru","1000sq",1000000);
        C1.Name();
        C1.Area();
        C1.Population();

    }
}