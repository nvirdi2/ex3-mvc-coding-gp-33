// This is an example of a view. In this case we will simply print out the product name and price
// We use the PropertyChangeListener to get notificaitons from the cash register

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
public class Display implements PropertyChangeListener {
    private Product product;
	
	Display () {
	
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub - complete.
		// How does Display get Product that was just entered in Keyboard?
		if ("product".equals(evt.getPropertyName())) {
			Product newProduct = (Product) evt.getNewValue();
			this.product = newProduct;
	
// print to console
		System.out.println("Product name: " + product.getName() + " price = " + product.getPrice());
		}
	}
}
