package coreservlets;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
public class Purchases {
  private String[] cheapItems =
    { "Jeruk", "Pisang", "Kedondong" };
  private List<String> mediumItems =
    new ArrayList<>();
  private Map<String,String> valuableItems =
    new HashMap<>();
  private boolean isEverythingOK = true;

  public Purchases() {
    mediumItems.add("Semangka");
    mediumItems.add("Melon");
    mediumItems.add("Jambu Kristal");
    valuableItems.put("low", "Sepeda");
    valuableItems.put("medium", "Motor");
    valuableItems.put("high", "Mobil");
  }

  public String[] getCheapItems() {
    return(cheapItems);
  }

  public List<String> getMediumItems() {
    return(mediumItems);
  }

  public Map<String,String> getValuableItems() {
    return(valuableItems);
  }

  public String purchaseItems() {
    isEverythingOK = Utils.doBusinessLogic(this);
    isEverythingOK = Utils.doDataAccessLogic(this);
    if (isEverythingOK) {
      return("purchase-success");
    } else {
      return("purchase-failure");
    }
  }
}