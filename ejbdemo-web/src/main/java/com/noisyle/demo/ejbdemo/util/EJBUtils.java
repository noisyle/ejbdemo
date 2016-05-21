package com.noisyle.demo.ejbdemo.util;

import java.util.Hashtable;

import javax.ejb.EJBHome;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public abstract class EJBUtils {

	public static EJBHome getEJBHome(String strHome) throws Exception {
		Context context = null;
		EJBHome home = null;
		try {
			context = getInitialContext();
		} catch (Exception e) {
			System.out.println("Exception creating InitialContext: "
					+ e.toString());
		}
		try {
			home = (EJBHome) context.lookup("java:comp/env/" + strHome);
		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println(strHome + " home not found - "
							+ "maybe without the reference declaration "
							+ e.toString());
		}
		return home;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Context getInitialContext() throws NamingException {
		Hashtable environment = new Hashtable();
		environment.put(Context.INITIAL_CONTEXT_FACTORY,
				"org.jnp.interfaces.NamingContextFactory");
		environment.put(Context.URL_PKG_PREFIXES,
				"org.jboss.naming:org.jnp.interfaces");
		environment.put(Context.PROVIDER_URL, "jnp://localhost:1099");
		return new InitialContext(environment);
	}

}