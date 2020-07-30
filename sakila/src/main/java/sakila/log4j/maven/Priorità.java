package sakila.log4j.maven;

public class Priorit� {

	public final static int OFF_INT = Integer.MAX_VALUE;
	public final static int FATAL_INT = 50000;
	public final static int ERROR_INT = 40000;
	public final static int WARN_INT = 30000;
	public final static int INFO_INT = 20000;
	public final static int DEBUG_INT = 10000;
	// public final static int FINE_INT = DEBUG_INT;
	public final static int ALL_INT = Integer.MIN_VALUE;
	
	/*
	 * Se la priorit� � definita in log4j.properties, 
	 * verr� registrato solo il messaggio di priorit� uguale o superiore.
	 */
}
