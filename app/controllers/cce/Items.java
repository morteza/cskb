/**
 * 
 */
package controllers.cce;

import controllers.CRUD;

@CRUD.For(models.cce.Item.class)
public class Items extends CRUD{
  
  protected static String description() {
    return "CCE Items";
  }
}
