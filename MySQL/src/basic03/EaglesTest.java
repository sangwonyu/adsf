package basic03;
import java.util.*;
public class EaglesTest {

	public static void main(String[] args) {
		EaglesDAO eDao =new EaglesDAO();
		//selectOne 메소드실행
		//EaglesDTO player = eDao.selectOne(13);
		//System.out.println(player.toString());
		
		//insert 메소드 실행
		/*eDao.insertEagles(new EaglesDTO(6,"김민하","외야수","대전고","우투","우타",1997,10000));
		EaglesDTO player =eDao.selectOne(6);
		System.out.println(player.toString()+"\n");
		
		eDao.deleteEagles(6);*/

		/*EaglesDTO player = eDao.selectOne(5);
		System.out.println(player.toString());
		player.setHand("우투우투");
		player.setSalary(200000);
		eDao.update(player);
		player=eDao.selectOne(5);
		System.out.println(player.toString());*/
		
		List<EaglesDTO> playerList = eDao.selectAll();
		for(EaglesDTO eagle:playerList) {
			System.out.println(eagle.toString());
		}
		
		//String positions[]= {"투수","포수","내야수","외야수"};
		/*System.out.println("연봉2억 이상인 선수는");
		List<EaglesDTO> playerList = eDao.selectPlayersBySalary(200000000);
		for(EaglesDTO sal: playerList) {
			System.out.println(sal.toString());
		}*/
		
		
		
		eDao.close();
		
	}

}
