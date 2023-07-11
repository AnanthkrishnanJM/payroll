package payroll;
class employee{
	void calculatePay(String name,double salary) {
		System.out.println(name+" "+salary*12);
	}
	void calculatePay(String name,double hourlyRate,double hoursWorked) {
		System.out.println(name+" "+hourlyRate*hoursWorked*7);
	}
}
class SalariedEmployee extends employee{
	String name;
	double salary;
}
class HourlyEmployee extends employee{
	String name;
	double hourlyRate;
	double hoursWorked;
}
public class PayRoll {

	public static void main(String[] args) {
		SalariedEmployee semployee =new SalariedEmployee();
		semployee.name="Govindan";
		semployee.salary=200000;
		semployee.calculatePay(semployee.name,semployee.salary );
		
		System.out.println("---------------------------------------");
		
		HourlyEmployee hemployee =new HourlyEmployee();
		hemployee.name="Bhaskaran";
		hemployee.hourlyRate=300;
		hemployee.hoursWorked=10;
		semployee.calculatePay(hemployee.name,hemployee.hourlyRate,hemployee.hoursWorked);

	}



}
