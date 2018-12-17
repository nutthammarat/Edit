import javax.swing.JOptionPane;

public class ProfileService {

    //public static void getDetailUser(User users) {
       // System.out.println(users.getUsername() + " a " + users.getAddress().toString());
    //}

    public static User getUser(String username) {
        return UserDao.getUser(username);
    }

    public static boolean changePhone(User user, String phone) {
        User thisUser = user;
        thisUser.setPhone(phone);
        if (UserDao.updatePhone(thisUser)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean changeAddress(User user, String address) {
        User thisUser = user;
        thisUser.setAddress(address);
        if (UserDao.updateAddress(thisUser)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkLengthPhone(String phone) {

        if (phone.length() == 10) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null,
                    "กรุณากรอกหมายเลขโทรศัพท์ให้ครบ 10 หลัก",
                    "พบข้อผิดพลาด",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public static boolean checkFristNumber(String phone) {

        if (phone.substring(0, 1).equals("0")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null,
                    "กรุณาตรวจสอบหมายเลขโทรศัพท์อีกครั้ง",
                    "พบข้อผิดพลาด",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public static boolean checkNullTextfield(String textfield) {
        if (textfield.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "กรุณากรอกข้อมูล",
                    "พบข้อผิดพลาด",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}
