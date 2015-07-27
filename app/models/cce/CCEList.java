/*******************************************************************************
 *        File: CCEList.java
 *    Revision: 1
 * Description: 
 *   Author(s): Morteza Ansarinia <ansarinia@me.com>
 *  Created on: July 27, 2014
 *     Project: itrc.cskb
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package models.cce;

import java.util.Date;

import javax.persistence.Entity;

import models.ModelWithTimestamp;

@Entity(name="cce_list")
public class CCEList extends ModelWithTimestamp {
  public String version;
}
