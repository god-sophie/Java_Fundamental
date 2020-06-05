package java_20200604;
//Emp 테이블의 데이터를 관리하기 위한 클래스
//Emp 테이블의 컬럼을(empno, ename, job, mgr, hiredate, sal, comm, deptno) 멤버변수로 설정
//DTO : Data Transfer Object
public class EmpDto {
	private int no;
	private String name;
	private String job;
	private int mgr;
	private String hireDate;
	private int sal;
	private int comm;
	private int deptNo;
	// EmpDto empDto = new EmpDto();
	public EmpDto () {	// default 생성자
		super();
	}
	public EmpDto(int no, String name, String job, int mgr, String hireDate, int sal, int comm, int deptNo) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.mgr = mgr;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	
}
