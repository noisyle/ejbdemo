package com.noisyle.demo.ejbdemo.ejb;

import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;


public interface HelloLocalHome extends EJBLocalHome {

	HelloLocal create() throws CreateException;

}
