/*******************************************************************************
 *        File: CCEItem.java
 *    Revision: 1
 * Description: CEE Item
 *   Author(s): Morteza Ansarinia <ansarinia@me.com>, Ali Sheykhi <ali.sheykhi@me.com
 *  Created on: April 14, 2015
 *     Project: itrc.cskb
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package models.cce;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import models.ModelWithTimestamp;
import play.data.validation.Unique;

@Entity(name = "cce_configuration")
public class Configuration extends ModelWithTimestamp {

  public String platform;
  public Boolean isDeprecated;
  public Date configurationModifiedAt;

  @Unique
  public String cceId;

  @Lob
  @Column(columnDefinition = "TEXT")
  public String description;

  @ElementCollection
  public List<String> parameters;

  @ElementCollection
  public List<String> technicalMechanisms;

  @OneToMany
  public List<Reference> references;
  
  public Configuration() {
    platform = "";
    isDeprecated = null;
    configurationModifiedAt = new Date();
    cceId = "";
    description = "";
    parameters = new ArrayList<String>();
    technicalMechanisms = new ArrayList<String>();
    references = new ArrayList<Reference>();   
  }
}
