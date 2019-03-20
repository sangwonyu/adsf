package exercise;

public class Ex18_ShopServiceEx {

	public static void main(String[] args) {
		Ex18_ShopService obj1 = Ex18_ShopService.getInstance();
		Ex18_ShopService obj2 = Ex18_ShopService.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은ShopService 객체입니다");
		} else System.out.println("다른ShopService 객체입니다");
		// TODO Auto-generated method stub

	}

}
