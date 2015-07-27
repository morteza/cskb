/*******************************************************************************
 *        File: TechnicalMechanism.java
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

@Entity(name="cce_technical_mechanism")
public class TechnicalMechanism extends ModelWithTimestamp {
  public String platform;
  public Boolean isDeprecated;
}
