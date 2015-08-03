/*******************************************************************************
 *        File: CCEList.java
 *    Revision: 1
 * Description: CEE List
 *   Author(s): Morteza Ansarinia <ansarinia@me.com>, Ali Sheykhi <ali.sheykhi@me.com
 *  Created on: April 14, 2015
 *     Project: itrc.cskb
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package models.cce;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import models.ModelWithTimestamp;

@Entity(name = "cce_list")
public class CCEList extends ModelWithTimestamp {
  public String version;

  public Date ccesModifiedAt;
  @OneToMany
  public List<CommonConfiguration> commonConfiguration;

  public Date resourceModifiedAt;
  @OneToMany
  public List<Resource> resources;
}
