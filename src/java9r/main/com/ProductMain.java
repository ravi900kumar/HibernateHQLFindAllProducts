package java9r.main.com;

 
import java.util.List;

import java9r.dao.com.*;
import java9r.entites.com.*;

public class ProductMain {
	public static void main(String[] args) {
		ProductDAO product = new ProductDAO();
		
		// All  products
		/*List<Product> liProducts=product.FindAllProducts();
		  System.out.println("Number of Products - " + liProducts.size());
		  for (Product pf : liProducts){
		   System.out.println("Id " + pf.getId());
		   System.out.println("Name " + pf.getName());
		   System.out.println("Price  " + pf.getPrice());
		   System.out.println("Status  " + pf.getActive());
		   System.out.println("---------------");
		  }
		*/
		
		List<Product> liProducts=product.findAllHQL();
		  System.out.println("Number of Products - " + liProducts.size());
		  for (Product pf : liProducts){
		   System.out.println("Id " + pf.getId());
		   System.out.println("Name " + pf.getName());
		   System.out.println("Price  " + pf.getPrice());
		   System.out.println("Status  " + pf.getActive());
		   System.out.println("---------------");
		  }
		
		
		 }
		
		
}