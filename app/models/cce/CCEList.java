/*******************************************************************************
 *        File: CCEList.java
 *    Revision: 1
 * Description: CEE List
 *   Author(s): Morteza Ansarinia <ansarinia@me.com>
 *  Created on: July 27, 2014
 *     Project: itrc.cskb
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package models.cce;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import models.ModelWithTimestamp;

@Entity(name="cce_list")
public class CCEList extends ModelWithTimestamp {
  public String version;
  
  @OneToMany
  public List<Item> items;
  
  @OneToMany
  public List<Resource> resources;
}
