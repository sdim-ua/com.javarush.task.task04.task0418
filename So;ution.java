/*
Минимум двух чисел
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

   int numb1 = Integer.parseInt(reader.readLine());
   int numb2 = Integer.parseInt(reader.readLine());
   
   if(numb1 > numb2){
       System.out.println(numb2);
   }
   else if (numb1 < numb2){
       System.out.println(numb1);
   }
   else if(numb1 == numb2){
        System.out.println(numb1);
   }
   
    }
}
