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

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import models.ModelWithTimestamp;
import play.data.validation.Unique;

@Entity(name = "cces")
public class cces extends ModelWithTimestamp {

	public String platform;
	public Boolean isDeprecated;
	public Date modifiedAt;
	
	@Unique
	public String cceId;
	
	@Lob
	@Column(columnDefinition = "TEXT")
	public String description;

	@OneToMany
	public List<Parameter> parameters;

	@OneToMany
	public List<TechnicalMechanism> technicalMechanism;
	
	@OneToMany
	public List<Reference> references; 
}
