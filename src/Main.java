import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
//    You are given an array nums consisting of positive integers.
//
//    Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
//
//    The frequency of an element is the number of occurrences of that element in the array.
//
//    Example 1:
//    Input: nums = [1,2,2,3,1,4,3,3]
//    Output: 4
//    Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
//    So the number of elements in the array with maximum frequency is 4.
//    nums 3:3 1:3 2:2 4:1 -> 3
//    Example 2:
//    Input: nums = [1,2,3,4,5]
//    Output: 5
//    Explanation: All elements of the array have a frequency of 1 which is the maximum.
//    So the number of elements in the array with maximum frequency is 5.
    public static void main(String[] args) {
       int [] num1 = {1,2,3,4,5};
       int [] num2={3,3,1,1,2,2,3,1,4,2};

        System.out.println(Findfrequency(num1));

        System.out.println(Findfrequency(num2));

    }
    public static int Findfrequency(int[]arr){
        int result=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int max=0;
       int prev=0;
        for (Map.Entry<Integer,Integer> value:map.entrySet()){
          if(max<value.getValue()) {
             max= Math.max(max,value.getValue());

          }  //
          if(max==value.getValue()){

                  int num=0;
                  for(int i=0;i<value.getValue();i++){
                      max+= value.getKey();
                  }
                  result= max;

          }


        }
        for(Map.Entry<Integer,Integer> value:map.entrySet()){
            if(max==value.getValue()){
                result+=max;
            }
        }


        return result;
    }
}