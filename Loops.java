//------------------------------------WHILE LOOP--------------------------------------------------

// public class Loops {
//     public static void main(String[] args) {
//         int i =1;
//         while (i<5) {
//             System.out.println("Hllo" + i);
//             int j = 1;
//             while (j<3) {
//                 System.out.println("Hiiii"+i);
//                 j++;
//             }
//             i++;
            
//         }
//         System.out.println("byee" +i);

//     }
    
// }

/**
 * Loops
 */
// public class Loops {

//     public static void main(String[] args) {
//         int i = 2;
//         int n = 9;
//         while (i<=n-1) {
//             if (n%i!=0) {
//                 System.out.println("is a prime number");
            
//             }
        
//             else System.out.println("not a prime number");
//             break;
//         }
//         i++;
// }
// }











//-----------------------do WHILE ---------------------------------------------
//   SYNTAX :-
//         intitilization;
//         do{
//             statement block;
//             updation or increment;
//         }while(condation);
//


// public class Loops {
//     public static void main(String[] args){
//         int k=5;
//         do{
//             System.out.println("kaif");
//             k++;
//         }while(k<3);
//     }

// }




//---------------------- FOR loop --------------------------syntax {for (initilization; condation; updation or increment){statement block}}

// public class Loops {
//     public static void main(String[] args){

//         for (int i = 1; i < 8; i++) {
//             System.out.println("DAY " + i);
//             for(int j=1;j<10;j++){
//                 System.out.println(" " + (j+8)+-+(j+9));
//             }
            
//         }
       
//     }

// }

/**
 * Loops
 */
public class Loops {

   
    public static void main(String[] args) {
       int n = 29;
       boolean f = true;
       if (n<2){
        System.out.println("not a prime");
        f=false;
       }
       else {
        for(int i = 2; i <=n/2; i++ ){
            if(n%i==0){
                f=false;
                System.out.println("not a prime");
                break;
            }
            
        }
        if(f==true){
            System.out.println("prime");
        }
       }
        
    }
}
