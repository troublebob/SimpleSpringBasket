package basket.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	private long id;
	private Set<OrderItem> orderItems = new HashSet<OrderItem>();
	
	@Id
    @GeneratedValue
    @Column(name = "order_id")
    public long getId() {
        return id;
    }
	
	@OneToMany(mappedBy = "order")
    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }
 
    public void setOrderItems(Set<OrderItem> groups) {
        this.orderItems = groups;
    }
     
    public void addOrderItem(OrderItem OrderItem) {
        this.orderItems.add(OrderItem);
    }
}
