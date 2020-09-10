package creational.factory;

import creational.factory.pages.CartPage;
import creational.factory.pages.ItemPage;
import creational.factory.pages.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
