package models;

public class DataLogin {

    private String USER;
    private String USER_NAME;
    private String PASSWORD;
    private String PASSWORD_INCORRECT;

    public DataLogin(){

        USER = "Mauricio Restrepo";
        USER_NAME = "1036662012";
        PASSWORD = "Ganagana2022--";
        PASSWORD_INCORRECT = "2345678";

    }

    public String getUSER() {
        return this.USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getUSER_NAME() {
        return this.USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getPASSWORD() {
        return this.PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getPASSWORD_INCORRECT() {
        return this.PASSWORD_INCORRECT;
    }

    public void setPASSWORD_INCORRECT(String PASSWORD_INCORRECT) {
        this.PASSWORD_INCORRECT = PASSWORD_INCORRECT;
    }
}
