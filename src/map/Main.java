package belhard.homework.map;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		int i =0;
		Map<Integer,Product> product = new HashMap<Integer,Product>();
		
product.put(++i,new Product(1,"Apple"));
product.put(++i,new Product(250,"Bike"));
product.put(++i,new Product(15000,"Car"));
product.put(++i,new Product(5,"Book"));
product.put(++i,new Product(2,"Pen"));
product.put(++i,new Product(700,"Phone"));
product.put(++i,new Product(1000000000,"Soul"));
for (Map.Entry<Integer, Product> item: product.entrySet()){
	System.out.printf("Key: %d\t NameProduct:%s\t Price($):%d%n",item.getKey(),item.getValue().getNameOfProduct(),item.getValue().getPrice());
}
for (Integer item: product.keySet()){
	System.out.printf("Key: %d\t ",item);
}
for (Product item: product.values()){
	System.out.printf("%nnameProduct: %s\t price($) %d ",item.getNameOfProduct(),item.getPrice());
}
	}

}
