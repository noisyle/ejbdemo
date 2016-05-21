package com.noisyle.demo.ejbdemo.ejb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

public interface HelloHome extends EJBHome {

	Hello create() throws CreateException, RemoteException;

}
