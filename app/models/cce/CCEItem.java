/*******************************************************************************
 *        File: CCEItem.java
 *    Revision: 1
 * Description: 
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

@Entity(name="cce_item")
public class CCEItem extends ModelWithTimestamp {
  public String platform;
  public Boolean isDeprecated;
  
  @OneToMany
  public List<TechnicalMechanism> technicalMechanism;
}
