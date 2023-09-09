package table;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Pid;
	private String Name;
	@Column(length = 3000)
	private String Description;
	private String Photo;
	private int Price;
	private int Discount;
	private int Quantity;
	@ManyToOne
	private Category category;
	public Product(int pid, String name, String description, String photo, int price, int discount, int quantity) {
		super();
		Pid = pid;
		Name = name;
		Description = description;
		Photo = photo;
		Price = price;
		Discount = discount;
		Quantity = quantity;
	}
	public Product(String name, String description, String photo, int price, int discount, int quantity) {
		super();
		Name = name;
		Description = description;
		Photo = photo;
		Price = price;
		Discount = discount;
		Quantity = quantity;
	}
	public Product() {
		super();
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", Name=" + Name + ", Description=" + Description + ", Photo=" + Photo
				+ ", Price=" + Price + ", Discount=" + Discount + ", Quantity=" + Quantity + "]";
	}
	
	
	
}
