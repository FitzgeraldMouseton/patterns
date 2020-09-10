package creational.factory;

import creational.factory.pages.AboutPage;
import creational.factory.pages.CommentPage;
import creational.factory.pages.ContactPage;
import creational.factory.pages.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
