package numerosaleatorios.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Program {

	public static void main(String[] args) {

		int number;
        
		List<Integer> numbers = new ArrayList<>();
        
		Random rand = new Random();
        
        while (numbers.size() <= 6) {
            number = rand.nextInt(60);
            
            if (!numbers.contains(number)) {
                numbers.add(number);        
            }
        }
        
        Collections.sort(numbers);
        
        for (int i = 1; i < numbers.size(); i ++) {
            System.out.println(numbers.get(i));
        }
    }
}
