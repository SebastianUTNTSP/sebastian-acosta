package Proxy;

import java.sql.Connection;

public class ProxyCon implements Databaseinfo {
	private RealCon realCon;
	private String url;

	public ProxyCon(String url) {
		this.url = url;
	}

	@Override public Connection getConnection() {
		if (realCon == null) {
			realCon = new RealCon(url);
			return realCon.getConnection();
		} else
			return realCon.getConnection();

	}
}
