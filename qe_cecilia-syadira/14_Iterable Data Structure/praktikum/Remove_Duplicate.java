import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 
import java.util.stream.Collectors; 

class Remove_Duplicate {
    public static void main(String[] args) 
    { 
        List<Integer> list = new ArrayList<>( 
            Arrays.asList(2, 3, 3, 3, 6, 9, 9)); 
    
        System.out.println("Input: "
                           + list); 
  
        List<Integer> newList = list.stream() 
                                      .distinct() 
                                      .collect(Collectors.toList()); 
  
        System.out.println("Output: "
                           + newList); 
    } 

}
