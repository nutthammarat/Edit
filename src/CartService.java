
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class CartService {

   static User user = LoginForm.userCurrent;

    public static ArrayList<Cart> getAllProduct(User users) {
        return CartDao.getAllProductCart(users);
    }

    public static boolean addToCart(User users, Product product, int num) {
        return CartDao.addCart(users, product, num);
    }

    public static void addCartToOrder(User users) {
        OrderDao.addOrder(getAllProduct(users));
        CartPage.addProductSuccess();
        deleteCart(users);
    }

    public static void showList() {

        ArrayList<Cart> list = CartService.getAllProduct(user);
        CartPage.addListModel(list);
    }

    public static boolean deleteProduct(String id) {
        CartDao.deleteProduct(user, ProductService.getProduct(id));
        CartPage.refresh(user);
        return true;
    }

    public static int calculatePrice() {
        ArrayList<Cart> cart = null;
        cart = CartService.getAllProduct(user);
        ArrayList<Integer> total = new ArrayList<>();
        int sum = 0;
        for (Cart e : cart) {
            sum = (e.getProduct().getPrice()) * (e.getNum());
            total.add(sum);
            sum = 0;
        }
        for (int i = 0; i < total.size(); i++) {
            sum += total.get(i);
        }
        return sum;
    }

    public static void deleteCart(User user) {
        CartDao.deleteAllProduct(user);
        CartPage.refresh(user);
//        showList();
    }

    

    public static void checkBtnConfirm() {
        ArrayList<Cart> cart = CartService.getAllProduct(user);
        if (cart.size() > 0) {
            CartPage.btn_Confirmorder.setEnabled(true);
            CartPage.btn_Remove.setEnabled(true);
        } else {
            CartPage.btn_Confirmorder.setEnabled(false);
            CartPage.btn_Remove.setEnabled(false);
        }
    }

}
