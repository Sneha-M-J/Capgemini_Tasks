package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity      //because it represents a table in the database
@Table(name="product3")   //creates a table with this name in the database
@NamedQuery(name="findAll",query="select p from Product p")
@NamedQueries
(
		{
			@NamedQuery(name="findById2",query="select p from Product p where id=2"),
			@NamedQuery(name="findById",query="select p from Product p where id=:id"),   //takes id value during runtime dynamically
			@NamedQuery(name="findByPrice",query="select p from Product p where price>:price")
		}
)
public class Product
{
	@Id
	private int productId;
	private String productname;
	private int price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productname=" + productname + ", price=" + price + "]";
	}
	
}
