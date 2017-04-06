package basket.facade;

import java.util.ArrayList;
import java.util.List;

import basket.model.Product;

public class ProductHelper {

	public static List<Product> allProducts;
	
	public ProductHelper() {
		ProductHelper.allProducts = new ArrayList<Product>();
		allProducts.add(new Product(50, "Aphrodite"));
		allProducts.add(new Product(100, "Apollo"));
		allProducts.add(new Product(50, "Zeus"));
		allProducts.add(new Product(10, "Hera"));
		allProducts.add(new Product(70, "Artemis"));
		allProducts.add(new Product(80, "Frank"));
		allProducts.add(new Product(110, "Barry"));
		allProducts.add(new Product(42, "Mushroom"));
		allProducts.add(new Product(5, "Tiswas"));
		allProducts.add(new Product(500, "Creepy"));
		allProducts.add(new Product(500, "Monkey"));
		allProducts.add(new Product(500, "Harambe"));
		allProducts.add(new Product(99, "Ted"));
		allProducts.add(new Product(99, "Dougal"));
	}
	public static Product getProduct(String title){
		if(ProductHelper.allProducts==null){
			
		}
		for (Product product : allProducts) {
			System.out.println(title+" "+product.getTitle());
			if(product.getTitle().equals(title)){
				return product;
			}
		}
		return null;
	}
	public String toString(){
		StringBuilder s = new StringBuilder();
		for (Product p: allProducts) {
			s.append(p.getTitle());
			s.append(" :£");
			s.append(String.format("%.2f", p.getPrice()));
			s.append('\n');
		}
		return s.toString();
	}
}
