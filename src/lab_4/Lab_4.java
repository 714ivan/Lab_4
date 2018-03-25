
package lab_4;

public class Lab_4 {

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int Arr[]=new int[20];
        for (int i=0; i<20; i++) Arr[i]=rand(5, -5);
        for (int i=0; i<20; i++) System.out.print(Arr[i]+" ");
        System.out.println();
        System.out.println();
        
        System.out.println("Задание 2");
        int Arr1[]=new int[5];
        int Arr2[]=new int[5];
        int Arr3[]=new int[5];
        int Arr4[]=new int[5];
        int Arr5[]=new int[5];
        for (int i=0; i<5; i++) Arr1[i]=rand(5, -5);
        for (int i=0; i<5; i++) Arr2[i]=rand(5, -5);
        for (int i=0; i<5; i++) Arr3[i]=rand(5, -5);
        for (int i=0; i<5; i++) Arr4[i]=rand(5, -5);
        for (int i=0; i<5; i++) Arr5[i]=rand(5, -5);
        Arr_Out(Arr1);
        Arr_Out(Arr2);
        Arr_Out(Arr3);
        Arr_Out(Arr4);
        Arr_Out(Arr5);
        Arr_Sorting(Arr);
        Arr_Out(Arr);
    }
    
   static int rand(int a, int b){
       if (b>a) return (int)(Math.random()*(b-a)+a);
       else return (int)(Math.random()*(a-b)+b);
   } 
  
   static void Arr_Out(int Arr[]){
       for (int i=0; i<Arr.length; i++) System.out.print(Arr[i]+" ");
        System.out.println();
   }
   
   static void Arr_Sorting(int Arr[]){
        int temp=0;
        for(int i = Arr.length-1 ; i > 0 ; i--){ //Всеми любимая Сортировка Пузырьком 
        for(int j = 0 ; j < i ; j++){
            if( Arr[j] > Arr[j+1] ){
                temp=Arr[j];
                Arr[j]=Arr[j+1];
                Arr[j+1]=temp;
            }
        }
    }
   }
}
