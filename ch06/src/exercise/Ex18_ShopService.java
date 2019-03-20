package exercise;

public class Ex18_ShopService {
	private static Ex18_ShopService shopService = new Ex18_ShopService();
	
	private Ex18_ShopService() {}
	
	static Ex18_ShopService getInstance() {
		return shopService;
	}

}
