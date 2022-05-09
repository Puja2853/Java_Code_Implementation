package consructor;

public class Constructor {

	int joiningYear;
	String empName;
	

	public Constructor(int date, String name) {
		joiningYear = date;
		empName = name;
	}

	public static void main(String[] args) {
		Constructor data = new Constructor(2021, "Puja Kadam");
		System.out.println(data.joiningYear + " " + data.empName);
	}
}

