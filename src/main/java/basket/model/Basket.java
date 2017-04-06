package basket.model;

import java.util.ArrayList;
import java.util.List;

import basket.model.Product;

public class Basket{

	private List<Product> basket;
	
	public Basket() {
		this.basket = new ArrayList<Product>();
	}
	
	public void addProduct(Product p){
		this.basket.add(p);
	}
	
	public void removeProduct(int i){
		this.basket.remove(i);
	}
	
	public int findProduct(Product p){
		return this.basket.indexOf(p);
	}
	
	public List<Product> getBasket(){
		return this.basket;
	}
	public double getTotalPrice(){
		double sumPrice = 0;
		for (Product p : basket) {
			sumPrice += p.getPrice();
		}
		return sumPrice;
	}
	public String toString(){
		StringBuilder s = new StringBuilder();
		for (Product p: this.basket) {
			s.append(p.getTitle());
			s.append(" :£");
			s.append(String.format("%.2f", p.getPrice()));
			s.append('\n');
		}
		return s.toString();
	}
}
