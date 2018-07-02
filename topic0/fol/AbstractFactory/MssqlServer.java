package fol.AbstractFactory;

public class MssqlServer implements Servers {
    @Override
    public String getUrl() {
        return "MssqlUrl";
    }

    @Override
    public String getUser() {
        return "MssqlUser";
    }

    @Override
    public String getPassword() {
        return "password";
    }
}
