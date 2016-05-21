package com.noisyle.demo.ejbdemo.ejb;

import javax.ejb.EJBLocalObject;

public interface HelloLocal extends EJBLocalObject {
	public String sayHello(String name);
}
