package com.noisyle.demo.ejbdemo.web;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.noisyle.demo.ejbdemo.ejb.Hello;
import com.noisyle.demo.ejbdemo.ejb.HelloHome;
import com.noisyle.demo.ejbdemo.util.EJBUtils;

public class HelloServlet implements Servlet {
	private ServletConfig config;

	public void init(ServletConfig config) throws ServletException {
		this.config = config;
	}

	public ServletConfig getServletConfig() {
		return this.config;
	}

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		try {
			String name = req.getParameter("name");
			if (name == null || "".equals(name)) {
				name = "world";
			}
			HelloHome home = (HelloHome) EJBUtils.getEJBHome("HelloHome");
			Hello hello = (Hello) home.create();
			res.getWriter().println(
					"<h1>" + hello.sayHello(name) + "</h1>");
		} catch (Exception e) {
			e.printStackTrace(res.getWriter());
		}
	}

	public String getServletInfo() {
		return "";
	}

	public void destroy() {
	}

}
