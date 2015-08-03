/*******************************************************************************
 *        File: TechnicalMechanism.java
 *    Revision: 1
 * Description: CEE Technical Mechanism
 *   Author(s): Morteza Ansarinia <ansarinia@me.com>, Ali Sheykhi <ali.sheykhi@me.com
 *  Created on: April 14, 2015
 *     Project: itrc.cskb
 *   Copyright: See the file "LICENSE" for the full license governing this code.
 *******************************************************************************/
package models.cce;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

import models.ModelWithTimestamp;

@Entity(name = "cce_technical_mechanism")
public class TechnicalMechanism extends ModelWithTimestamp {

  @Lob
  @Column(columnDefinition = "TEXT")
  public String technicalMechanism;

}
