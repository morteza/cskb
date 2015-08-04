/*******************************************************************************
 *        File: Resource.java
 *    Revision: 1
 * Description: CEE Resource
 *   Author(s): Morteza Ansarinia <ansarinia@me.com>, Ali Sheykhi <ali.sheykhi@me.com
 *  Created on: April 14, 2015
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
import play.data.validation.Unique;

@Entity(name = "cce_resource")
public class Resource extends ModelWithTimestamp {

  @Unique
  @Lob
  @Column(columnDefinition = "TEXT")
  public String resourceId;

  public String title;
  public String version;
  public String format;
  public Date issuedAt;
  @ElementCollection
  public List<String> creators;
  public String publisher;

  @Lob
  @Column(columnDefinition = "TEXT")
  public String notes;

}
