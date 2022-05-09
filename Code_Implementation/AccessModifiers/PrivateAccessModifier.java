package AccessModifiers;

	class Data {
	 private String empName;
	 private String empEmailId;
	 private int empId;
	 
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public int getempId() {
		return empId;
	}
	public void setempId(int empId) {
		this.empId = empId;
	}

	    
	}
	public class PrivateAccessModifier {
		
	public static void main(String[] args) {
		Data d = new Data();

        // access the private variable using the getter and setter
        d.setEmpName("Puja Kadam");
        d.setEmpEmailId("puja.balaji-kadam@capgemini.com");
        d.setempId(9876);
        
        System.out.println(d.getEmpName());
        System.out.println(d.getEmpEmailId());
        System.out.println(d.getempId());
	}

}
