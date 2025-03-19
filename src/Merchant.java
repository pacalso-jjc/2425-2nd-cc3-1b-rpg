import java.util.List;

public class Merchant extends NPC {
  List<String> stock = new ArrayList<>();
  
  public boolean buyItem (Character buyer, Item item, int quantity) {}
  public boolean sellItem (Character seller, Item item, int quantity) {}
  protected void setPrices (Item item, float newPrice) {}
  protected void restockItems() {}
}
