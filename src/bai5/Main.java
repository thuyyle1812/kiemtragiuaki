package bai5;

public class Main {
    public static void main ( String[] args ) {
        // Tạo một đối tượng User
        User user = new User ( "nguyenvanan", "an@gmail.com", "helloword" );

        // Đăng nhập
        if ( user.login ( "nguyenvanan", "helloword" ) ) {
            System.out.println ( "Đăng nhập thành công!" );
        } else {
            System.out.println ( "Đăng nhập thất bại." );
        }

        // Đăng ký
        user.register ( );

        // Đăng xuất
        user.logout ( );
    }
}