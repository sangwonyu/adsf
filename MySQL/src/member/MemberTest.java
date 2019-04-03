package member;
import java.util.*;
import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class MemberTest {

	public static void main(String[] args) {
		MemberDAO mDao=new MemberDAO();
		MemberDTO mDto = new MemberDTO();
		mDto=mDao.selectOne(100001);
		mDto.setPassword("iiii");
		mDto.setName("유유유");
		
		mDto.setAddress("전주시덕진구금암동");
		mDao.MemberUpdate(mDto);
		System.out.println(mDto);
		}
	}

