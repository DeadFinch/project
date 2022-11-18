package belhard.homework.part9;

import java.util.ArrayList;

public class HeavyBox {
	private int weight;
	private String owner;
	HeavyBox(){}
	HeavyBox (int wight,String owner){
		this.owner= owner;
		this.weight=wight;}
public String toString (){
	return String.format( "Owner=%s; weight=%d",owner,weight);
}
 public int getWight() {
	return weight;
}
 public void setWight(int wight){
	 this.weight=wight;
 }
 public String getOwner() {
		return owner;
	}
	 public void setOwner(String owner){
		 this.owner=owner;
	 }
	 public static void main(String[] args) {
			String [] name = {"Артём","Павел","Саша","Даша","Иван"};
			int j=1;
			int j1=0;
			ArrayList<HeavyBox> hb = new ArrayList<>();
			for (int i =0;i<32;i++) {
				hb.add(new HeavyBox(32-j1++,name[(int) (Math.random()*5)]));
				}
			for (HeavyBox box:hb) {
				System.out.printf("Box №%d %s\n",j,box);
				j++;
			}
				hb.set(1, new HeavyBox(1,name[(int) (Math.random()*5)]));
				System.out.printf("Box №%d %s\n",1,hb.get(1));
				System.out.println(hb.size());
				hb.remove(hb.size()-1);
				System.out.println(hb.size());
				hb.clear();
				System.out.println(hb.size());
		}

	}
