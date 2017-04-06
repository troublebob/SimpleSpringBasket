package basket.model;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	private long id;
	private double price;
	private String itemDescription;
	private Set<OrderItem> orderItems = new HashSet<OrderItem>();
	
	public Product(){
		
	}
	public Product(double price, String title) {
		super();
		this.price = price;
		this.itemDescription = title;
	}
	public void addOrder(OrderItem g){
		this.orderItems.add(g);
	}
	@Id
	@GeneratedValue
	@Column( name = "product_id")
	public long getId(){
		return id;
	}
	public void setId(long id){
		this.id = id;
	}
	
	public double getPrice() {
		DecimalFormat df2 = new DecimalFormat("###.##");
        return Double.valueOf(df2.format(this.price));
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return itemDescription;
	}

	public void setTitle(String title) {
		this.itemDescription = title;
	}
	
    @OneToMany(mappedBy = "product")
    public Set<OrderItem> getUserGroups() {
        return orderItems;
    }
 
    public void setOrderItems(Set<OrderItem> items) {
        this.orderItems = items;
    }
     
    public void addOderItems(OrderItem orderItem) {
        this.orderItems.add(orderItem);
    }
}
