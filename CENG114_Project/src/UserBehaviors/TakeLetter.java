package UserBehaviors;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TakeLetter implements TakeLetterBehavior {

   

    @Override
    public void takeLetter(char[] currentArr, String answer) {

         
        while (true) {
            int random = (int) (Math.random() * currentArr.length);
            if (currentArr[random] == '-') {
                currentArr[random] = answer.charAt(random);
                count++;
                System.out.println(count);
                break;
            }
        }
        
    }
    
   
    
    
}
