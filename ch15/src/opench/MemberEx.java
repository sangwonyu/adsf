package opench;

import java.time.LocalDate;
import java.util.*;

public class MemberEx {

	public static void main(String[] args) {
		TreeSet<Member> member = new TreeSet<Member>();
		member.add(new Member(1001,"김하눌","부장",LocalDate.of(1995, 8, 25)));
		member.add(new Member(1002,"이유환","부장",LocalDate.of(1995, 11, 25)));
		member.add(new Member(1003,"유상원","과장",LocalDate.of(1995, 8, 25)));
		member.add(new Member(1004,"박진우","과장",LocalDate.of(1993, 1, 30)));
		member.add(new Member(1005,"최형준","차장",LocalDate.of(1991, 7, 5)));
		member.add(new Member(1006,"김범현","차장",LocalDate.of(1996, 10, 27)));
		member.add(new Member(1007,"선재혁","대리",LocalDate.of(1998, 3, 27)));
		member.add(new Member(1008,"박준희","대리",LocalDate.of(1999, 2, 21)));
		member.add(new Member(1009,"김남술","사원",LocalDate.of(2011, 1, 25)));
		member.add(new Member(10010,"김지연","사원",LocalDate.of(2015, 2, 28)));
		for (Member emp: member)
			System.out.println(emp.toString());
	}
	

}
