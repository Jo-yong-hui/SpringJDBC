package yh.spring.vo;

public class Member {

	protected String mno;
	protected String userid;
	protected String passwd;
	protected String name;
	protected String email;
	protected String joindate;
	
	//매개변수를 이용한 생성자
	public Member(String userid, String passwd, String name, String email) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
	}

	//위 매개변수 4개 this로 한번에 초기화 한후 mno, joindate추가한것
	public Member(String mno, String userid, String passwd, String name, String email, String joindate) {
		this(userid,passwd,name,email);
		this.mno = mno;
		this.joindate = joindate;
	}

	public String getMno() {
		return mno;
	}

	public void setMno(String mno) {
		this.mno = mno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append(mno).append(" ");
		sb.append(userid).append(" ");
		sb.append(name).append(" ");
		sb.append(email).append(" ");
		sb.append(joindate).append("\n");
		
		return sb.toString();
	}

	
}
