package coreservlets;

import javax.faces.bean.*;

@ManagedBean
public class SimpleBean {
  private String[] colors =
    { "red", "orange", "yellow" };
  
  public String getMessage() {
    return("Hello, Nobi");
  }
  
  public String[] getColors() {
    return(colors);
  }
}