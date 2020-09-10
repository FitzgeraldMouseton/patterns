package creational.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		Blog site = (Blog) WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		Website site2 = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(site2.getPages());
	}

}
