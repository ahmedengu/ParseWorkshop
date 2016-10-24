package com.parse4cn1;


/**
 *  Represents a Role on the Parse server. ParseRoles represent groupings of 
 *  ParseUsers for the purposes of granting permissions 
 *  (e.g. specifying a ParseACL for a ParseObject). Roles are specified by their 
 *  sets of child users and child roles, all of which are granted any permissions 
 *  that the parent role has.
 *  <p>
 *  Roles must have a name (which cannot be changed after creation of the role),
 *  and must specify an ACL.
 */
public class ParseRole extends ParseObject {

	protected ParseRole() {
	}

	public void setName(String name) {
	}

	public String getName() {
	}

	@java.lang.Override
	protected void validateSave() {
	}
}
