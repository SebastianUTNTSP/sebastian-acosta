package Proxy;

public class Demo {
	public static void main(String[] args) {

		Databaseinfo a = new ProxyCon("Databaseurl");
		a.getConnection();

	}
}
