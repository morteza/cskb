/*******************************************************************************
 *        File: Resource.java
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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import models.ModelWithTimestamp;
import play.data.validation.Unique;

@Entity(name="cce_resource")
public class Resource extends ModelWithTimestamp {
  
  @Unique
  public String CEEId;
  
  public String title;
  public String version;
  public String format;
  public Date issuedAt;
  public String creator;
  public String publisher;
  
  @Lob
  @Column(columnDefinition="TEXT")
  public String notes;

}
