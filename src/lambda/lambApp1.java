/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda;

import java.util.Arrays;

/**
 *
 * @author aashgar
 */
public class lambApp1 {
    public static void main(String[] args) {
        myOperation<Integer> add = (x,y) -> x * y;
        System.out.println(add.operation(10, 5));
        
        Integer[] ar = {1, 2, 7, 3, 8, 4, 5, 6, 9, 10};
        Arrays.stream(ar)
                .sorted()
                .forEach((x -> System.out.println(x)));

        myOperation2 op2 = ()-> System.out.println("test");
        op2.operation();
    }
    
    interface myOperation<T>{
        T operation(T x, T y);
    }
    interface myOperation2{
        void operation();
    }
}
