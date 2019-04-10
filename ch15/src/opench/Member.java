package opench;

import java.time.LocalDate;
import java.util.*;

public class Member implements Comparable<Member> {
	public int buzNum;
	public String name;
	public String grade;
	public LocalDate join;

	public Member(int buzNum, String name, String grade, LocalDate join) {
		this.buzNum = buzNum;
		this.name = name;
		this.grade = grade;
		this.join = join;
	}

	public int getBuzNum() {
		return buzNum;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public LocalDate getJoin() {
		return join;
	}

	@Override
	public String toString() {
		return "Member [buzNum=" + buzNum + ", name=" + name + ", grade=" + grade + ", join=" + join + "]";
	}

	@Override
	public int compareTo(Member m) {
		
		  Position thisPos=Position.valueOf(grade); Position
		  oPos=Position.valueOf(m.getGrade());
		 /* 
		 * if(thisPos.compareTo(oPos)>0)return 1; else if(thisPos.compareTo(oPos)<0)
		 * return -1; else return 0; }
		 */

		if (thisPos.ordinal() < oPos.ordinal())
			return -1;
		else if (thisPos.ordinal() > oPos.ordinal())
			return 1;
		else {
			if (join.isBefore(m.getJoin()))
				return -1;
			if (join.isAfter(m.getJoin()))
				return 1;
			return 0;
		}
	}
}
