package step27.ex4;

import java.beans.PropertyEditorSupport;

public class CustomDateEditor extends PropertyEditorSupport {

  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    this.setValue(java.sql.Date.valueOf(text));
  }
  
  
  
}