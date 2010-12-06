package at.jku.ce;

import java.util.UUID;

public class DomainObject {

	private String uuid = UUID.randomUUID().toString();

	private String name;
	
	private String comment;

	/**
	 * Default constructor
	 */
	public DomainObject() {
		super();
	}

	public DomainObject(String id, String comment) {
		  super();
		  this.id = id;
		}

	public String getUuid() {
		   return id;
		}

	public String getComment() {
		   return comment;
		}

	public void setComment(String comment) {
	   this.comment = comment;
	}

}
