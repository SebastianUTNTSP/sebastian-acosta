package Proxy;

import java.sql.Connection;

public class RealCon implements Databaseinfo {
    private Connection conn;
    private String url;
    public RealCon(String url) {
        this.url = url;

    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public Connection getConnection() {
        System.out.println(getUrl());
        return conn;
    }
}
