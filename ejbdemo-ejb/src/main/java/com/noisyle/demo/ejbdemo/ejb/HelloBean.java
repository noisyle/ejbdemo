package com.noisyle.demo.ejbdemo.ejb;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class HelloBean implements SessionBean {

	private static final long serialVersionUID = 6489028198698617495L;

	public String sayHello(String name) {
		return "Hello " + name + "!";
	}

	public void ejbCreate() throws javax.ejb.CreateException,
			java.rmi.RemoteException {
	}

	public void ejbActivate() throws EJBException, RemoteException {

	}

	public void ejbPassivate() throws EJBException, RemoteException {

	}

	public void ejbRemove() throws EJBException, RemoteException {

	}

	public void setSessionContext(SessionContext arg0) throws EJBException,
			RemoteException {

	}

}
