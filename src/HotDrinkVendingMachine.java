import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

  List<HotDrinkExtends> productList = new ArrayList<>();


  @Override
  public HotDrinkExtends getProduct(int name, int volume, int temperature) {
    for (HotDrinkExtends product : productList){
      if (product.name == name && product.volume == volume && product.temperature == temperature){
        return product;

      }
    }
    return null;
  }
}
