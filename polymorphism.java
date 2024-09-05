 class Student{
    
    String name;
    int age;

    public void info(String name){
        System.out.printf(name);

    }
    public void info(int age){
        System.out.println(age);
    }
    public void info(String name,int age){
        System.out.println(name+age);
    }
   

}
class polymorphism{
    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="kaif";
        s1.age=23;
        s1.info(s1.name,s1.age);
    }
}
