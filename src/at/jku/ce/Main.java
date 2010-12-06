package at.jku.ce;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());

		objectSet.add(DomainFactory.createDomainObject("Helga", "Comment2"));
		objectSet.add(DomainFactory.createDomainObject("Walter", "Comment2"));
		objectSet.add(DomainFactory.createDomainObject("Hannah", "Comment2"));
		objectSet.add(DomainFactory.createDomainObject("Paul", "Comment2"));
		objectSet.add(DomainFactory.createDomainObject("Claudia", "Comment2"));

		for (DomainObject domainObject : objectSet) {
		  LOGGER.debug(domainObject.toString());
		}
	}

}
