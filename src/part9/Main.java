package belhard.homework.part09;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



public class Main {

	public static void main(String[] args) {


		Map<Integer,Integer> numb = new HashMap<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i<10;i++) {
			numbers.add((int)(1+Math.random()*3));
		}
		System.out.println(numbers.toString());
		for(int i = 0;i<numbers.size();i++) {
			Integer eqNumber = numbers.get(i);
			if(!numb.containsKey(eqNumber)) {
				numb.put(eqNumber,1);
			}
			else {
				numb.put(eqNumber, numb.get(eqNumber)+1);
			}
		}


		for (Map.Entry<Integer, Integer> entery: numb.entrySet()) {
			System.out.printf("Наименование цифры: %d повторений: %d%n",entery.getKey(),entery.getValue());
		}
	}


}

