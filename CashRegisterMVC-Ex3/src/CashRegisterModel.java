import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

public class CashRegisterModel {

	private PropertyChangeSupport observables;
	private ArrayList<Product> myProducts;
	
	CashRegisterModel (ArrayList<Product> products) {
		myProducts=products;
		observables = new PropertyChangeSupport(this);
	}

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
		// TODO Auto-generated constructor stub - complete
		observables.addPropertyChangeListener(pcl);
    }
    
   
    public void processUPC(int code) {
    // use UPC to look up product and price - complete
    		Product product = getProductUPC(code);
	    	if (product != null) {
			observables.firePropertyChange("product", null,product);
		}
    // Notify observers - complete 
    }
	
	public ArrayList<Product>	getProductList() {
		return this.myProducts;
	}

	private Product getProductUPC (int code) {
		for (Product product : myProducts) {
			if (product.getUPC() == code) {
				return product;
			}
		}
		return null;
	}	
}
