/*******************************************************************************
 *        File: CCEItem.java
 *    Revision: 1
 * Description: CEE Item
 *   Author(s): Morteza Ansarinia <ansarinia@me.com>
 *  Created on: July 27, 2014
 *     Project: itrc.cskb
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package models.cce;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import models.ModelWithTimestamp;

@Entity(name="cce_item")
public class Item extends ModelWithTimestamp {
  public String platform;
  public Boolean isDeprecated;
  
  @Lob
  @Column(columnDefinition="TEXT")
  public String description;
  
  @ElementCollection
  public List<String> parameters;
  
  @OneToMany
  public List<TechnicalMechanism> technicalMechanism;
}
