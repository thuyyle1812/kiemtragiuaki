package bai5;

public class User {
    private String username;
    private String email;
    private String password;
    public User ( String username, String email, String password ) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public boolean login ( String enteredUsername, String enteredPassword ) {
        return username.equals ( enteredUsername ) && password.equals ( enteredPassword );
    }

    public void register () {
         System.out.println ( "Đăng ký thành công!" );
    }
    public void logout () {
               System.out.println ( "Đã đăng xuất." );
    }
}