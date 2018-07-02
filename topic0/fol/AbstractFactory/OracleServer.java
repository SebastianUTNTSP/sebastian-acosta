package fol.AbstractFactory;


public class OracleServer implements Servers {


    @Override
    public String getUrl() {
        return "OracleUrl";
    }

    @Override
    public String getUser() {
        return "OracleUser";
    }

    @Override
    public String getPassword() {
        return "qwerty";
    }
}
