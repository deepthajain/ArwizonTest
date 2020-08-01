package com.arwizon.book.main;

import java.util.*;
import com.arwizon.book.details.BookDetails;
import com.arwizon.book.exception.MyException;
import com.arwizon.book.service.BookServiceInterface;
import com.arwizon.book.service.BookServiceInterfaceImp;
import com.arwizon.book.utilities.Utilities;

public class Test {

	public static void main(String[] args) {
		System.out.println(
				"Press 1 to add book press 2 to display book details press 3 to search press 4 to update press 5 to exit");
		Scanner s = new Scanner(System.in);

		Set<BookDetails> c = new HashSet<BookDetails>();

		while (true) {
			System.out.println("Choose your option");
			int option = s.nextInt();
			switch (option) {

			case 1:
				String name = null;
				while (true) {
					System.out.println("Enter book name");
					name = s.next();
					try {
						Utilities.nameValidation(name);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}

				}
				String bookType = null;
				while (true) {
					System.out.println("Enter book type");
					bookType = s.next();
					try {
						Utilities.nameValidation(name);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}

				}

				String numOfCopies = null;
				while (true) {
					System.out.println("Enter price");
					numOfCopies = s.next();
					try {
						Utilities.copiesValidation(numOfCopies);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}
				}
				int noOfCopies = Integer.parseInt(numOfCopies);

				String authorName = null;
				while (true) {
					System.out.println("Enter Manufacturer name");
					authorName = s.next();
					try {
						Utilities.nameValidation(authorName);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}

				}

				String price = null;
				while (true) {
					System.out.println("Enter the cost");
					price = s.next();
					try {
						Utilities.costValidation(price);
						break;
					} catch (MyException e) {
						System.out.println(e.getMessage());
					}

				}
				double cost = Double.parseDouble(price);

				BookServiceInterface si = new BookServiceInterfaceImp();
				si.book(name, bookType, authorName, noOfCopies, cost);
				// m.put(p1.getProductId(),p1);
				System.out.println("Product added successfully!");
				break;
			case 2:
				BookServiceInterface si1 = new BookServiceInterfaceImp();
				Set<BookDetails> m1 = si1.displayBooks();
				for (BookDetails p : m1) {
					System.out.println(p);
				}
				break;

			case 3:
				System.out.println("Enter product name to search");
				String pname = s.next();

				BookServiceInterface prod = new BookServiceInterfaceImp();

				Set<BookDetails> product = prod.searchBook(pname);
				if (product.size() == 0) {
					System.out.println("Product not found");
				} else {
					// System.out.println(product);
					for (BookDetails p : product) {
						System.out.println(p);
					}

				}
				break;
		
			case 4:
				BookServiceInterface prod2 = new BookServiceInterfaceImp();
				System.out.println("Enter the product id");
				String id1 = s.next();
				int productId3 = Integer.parseInt(id1);
				System.out.println("Enter the number of units");
				String numOfUnits1 = s.next();
				int noOfUnits1 = Integer.parseInt(numOfUnits1);
				prod2.updateBook(productId3, noOfUnits1);
				System.out.println("Updated Successfully");
				break;

			case 5:
				System.exit(1);
				break;
			default:
				System.out.println("Please enter the valid option");
			}
		}

	}

}
