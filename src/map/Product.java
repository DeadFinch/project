package belhard.homework.map;

public class Product {

private String nameOfProduct;
private int price;
Product(){}
Product(int index,String nameOfProduct){
	this.price=index;
	this.nameOfProduct=nameOfProduct;
}

public String getNameOfProduct() {
	return nameOfProduct;
}
public void setNameOfProduct(String nameOfProduct) {
	this.nameOfProduct = nameOfProduct;
}
public int getPrice() {
	return price;
}
public void setPrice(int index) {
	this.price = index;
}
}
