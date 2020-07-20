
package acme.entities;

import javax.persistence.Entity;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ToolRecords extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				title;

	@NotBlank
	private String				activitySector;

	@NotBlank
	private String				inventorsName;

	@NotBlank
	private String				description;

	@NotBlank
	private String				website;

	@Email
	@NotBlank
	private String				email;

	@NotBlank
	private String				indication;

	@Min(value = -5)
	@Max(value = 5)
	private Integer				stars;

}
