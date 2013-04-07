package models;

import play.modules.siena.EnhancedModel;
import siena.Column;
import siena.Generator;
import siena.Id;

import play.modules.siena.EnhancedModel;
import siena.Generator;

public class World extends EnhancedModel  {

	@Id(Generator.NONE)
	public Long id ;
	
	@Column("randomNumber")
	public Long randomNumber;

}