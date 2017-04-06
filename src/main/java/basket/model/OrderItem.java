package basket.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="order_items")
public class OrderItem {

	private long id;
	private Product product;
    private Order order;
    
    //Additional Field 
    private int quantity;
    
    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")  
    public Product getProduct() {
        return product;
    }
 
    public void setProduct(Product product) {
        this.product = product;
    }
 
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    public Order getOrder() {
        return order;
    }
 
    public void setOrder(Order order) {
        this.order = order;
    }
	
	
}
