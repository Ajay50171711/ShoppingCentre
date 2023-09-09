package table;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cid;
	private String Ctitle;
	private String Cdescription;
	@OneToMany
	private List<Product>  product = new ArrayList<>(); 
	public Category(int cid, String ctitle, String cdescription, ArrayList<Product> product) {
		super();
		Cid = cid;
		Ctitle = ctitle;
		Cdescription = cdescription;
		this.product = product;
	}

	public Category(int cid, String ctitle, String cdescription) {
		super();
		Cid = cid;
		Ctitle = ctitle;
		Cdescription = cdescription;
	}

	public Category(String ctitle, String cdescription) {
		super();
		Ctitle = ctitle;
		Cdescription = cdescription;
	}

	public Category() {
		super();
	}

	public int getCid() {
		return Cid;
	}

	public void setCid(int cid) {
		Cid = cid;
	}

	public String getCtitle() {
		return Ctitle;
	}

	public void setCtitle(String ctitle) {
		Ctitle = ctitle;
	}

	public String getCdescription() {
		return Cdescription;
	}

	public void setCdescription(String cdescription) {
		Cdescription = cdescription;
	}
	

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(ArrayList<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Category [Cid=" + Cid + ", Ctitle=" + Ctitle + ", Cdescription=" + Cdescription + "]";
	}

}
