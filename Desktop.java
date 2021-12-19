package week3.day2;



public class Desktop implements Hardware,Software{

	public void hardwareResources() {
	      
		System.out.println("RAM");
	}

	public void softwareResources() {
   System.out.println("windows");
   
	}
			
	public void DesktopModel() {
System.out.println("desktop");		
	}
	public static void main(String[] args) {
		Desktop my= new Desktop();
		my.DesktopModel();
		my.hardwareResources();
		my.softwareResources();
	}
}
