package java_20200519;

public class Admin {
	// 멤버변수는 습관적으로 private를 쓰자ㅏㅏㅏㅏ
	private String id;
	private String pwd;
	private String email;
	private int level;
	
	// alt + shift + s => o ,c
	// 디폴트 생성자(default constructor)
	// private -> 객체를 만들땐 클래스내에서만 만들어지기 때문에 외부에서 인식못함.
	public Admin() {
		super();	// 부모 클래스의 디폴트 생성자를 호출
	}
	
	
	// 생성자(Constructor)
	// 생성자는 생긴건 메소드처럼 생겼지만 반환값이 없음. 이름은 클래스 이름과 동일
	// 생성자의 역할은 인스턴스변수 초기화
	public Admin(String id, String pwd, String email, int level) {
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}
	
	// 생성자의 오버로딩
	public Admin(String id, String pwd, String email) {
		//super();
		//this.id = id;
		//this.pwd = pwd;
		//this.email = email;
		this(id,pwd,email,0);	// 여기서 this는 다른 생성자를 호출. 반드시 다른 생성자에서만 호출
	}
	
	// id에 대한 setter 메소드
	public void setId(String id) {
		this.id = id;
	}
	
	// id에 대한 getter 메소드
	public String getId() {
		return id;
	}
	
	// pwd에 대한 setter 메소드
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	// pwd에 대한 getter 메소드
	public String getPwd() {
		return pwd;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
	
}
