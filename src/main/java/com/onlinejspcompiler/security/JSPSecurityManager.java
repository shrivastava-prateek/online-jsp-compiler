package com.onlinejspcompiler.security;

import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

public class JSPSecurityManager extends SecurityManager{

	//Work in Progress
	@Override
	public void checkPermission( Permission permission ) { 
		System.out.println("inside check permission method---" + permission.getClass().toString()
				+"---Name: "+ permission.getName());
		switch(permission.getClass().toString()) {
		
		case "java.awt.AWTPermission":
		case "java.io.FilePermission":
		case "java.io.SerializablePermission":
		case "java.lang.management.ManagementPermission":
		case "java.lang.reflect.ReflectPermission":
		case "java.lang.RuntimePermission":{
			switch(permission.getName()) {
			//case "queuePrintJob": throw new SecurityException("Dude! No Printing Please!");
			}
		}
		case "java.net.NetPermission":
		case "java.net.SocketPermission":
		case "java.nio.file.LinkPermission":
		case "java.security.SecurityPermission":
		case "java.sql.SQLPermission":
		case "java.util.PropertyPermission":
		case "javax.net.ssl.SSLPermission":
		case "javax.security.auth.AuthPermission":
		case "javax.security.auth.kerberos.DelegationPermission":
		case "javax.security.auth.kerberos.ServicePermission":
		case "javax.security.auth.PrivateCredentialPermission":
		case "javax.sound.sampled.AudioPermission":
		case "javax.xml.bind.JAXBPermission":
		case "WebServicePermission":
		}
		
	} 
	
	/*
	 * @Override public void checkAccept(String host, int port) { throw new
	 * SecurityException("Dude! Simple JSP snippet please!"); }
	 */
	
	@Override
	public void checkExec(String cmd) {
		throw new SecurityException("Dude! No commands please!");
	}
	
	@Override
	public void checkExit(int status) {
		throw new SecurityException("Dude! Stop Playing! Whole world is running on this JVM!!");
	}
	
	@Override
	public void checkPrintJobAccess(){
		throw new SecurityException("Dude! No Printing Please!");
	}
	
	@Override
	public void checkMulticast(InetAddress maddr) {
		throw new SecurityException("WTF is wrong with this world!");
	}
	
	/*
	 * @Override public void checkAccess(Thread t) { throw new
	 * SecurityException("Dude! No Thread manipulations!"); }
	 */
	
	/*
	 * @Override public void checkAccess(ThreadGroup g){
	 * 
	 * throw new SecurityException("Dude! No Thread manipulations!"); }
	 */
	
	@Override
	public void checkAwtEventQueueAccess() {
		throw new SecurityException("Are you trying to play with AWT here? Please read the title of the page!!");
	}
	
	@Override
	public void checkConnect(String host, int port) {
		throw new SecurityException("Dude! Sockets are not for kids!");
	}
	
	@Override
	public void checkConnect(String host, int port, Object context) {
		throw new SecurityException("Dude! Sockets are not for kids!");
	}
	
	/*
	 * @Override public void checkCreateClassLoader() { throw new
	 * SecurityException("Ahem! Ahem! Classloader!"); }
	 */
	
	@Override
	public void checkDelete(String file) {
		System.out.println("file name: "+file);
		if(!(file.contains("test_jsp.java") || file.contains("test_jsp.class")))
		throw new SecurityException("Dude! I know you like deleting/destroying things, but here these are not allowed!");
	}
	
	@Override
	public void checkLink(String lib) {
		throw new SecurityException("Dude! No Linking!");
	}
	
	@Override
	public void checkListen(int port) {
		throw new SecurityException("Don't try to sneak on other ports!");
	}
	
	@Override
	public void checkMemberAccess(Class<?> clazz, int which) {
		throw new SecurityException("No Access related snippets please!");
	}
	

	
	
	  @Override public void checkPropertiesAccess() { throw new
	  SecurityException("Don't Play with System!!"); }
	 
	
	/*
	 * @Override public void checkPropertyAccess(String key) {
	 * System.out.println("Property Key: "+ key); throw new
	 * SecurityException("Don't try to sneak on system properties!"); }
	 */
	
	@Override
	public void checkSetFactory() {
		throw new SecurityException("Dude! Sockets are not for kids!");
	}
	
	@Override
	public void checkSystemClipboardAccess() {
		throw new SecurityException("Use your own System Cipboard!");
	}
	
	@Override
	public boolean checkTopLevelWindow(Object window) {
		throw new SecurityException("Nope! Neva!");
	}
	
	/*
	 * @Override public void checkWrite(FileDescriptor fd) {
	 * System.out.println(fd.toString()); throw new
	 * SecurityException("Sorry, you can't write a file descriptor!"); }
	 */
	
	@Override
	public void checkWrite(String file){
		System.out.println("filestring: "+file);
		if(!(file.contains("test.jsp") || file.contains("test_jsp.java") || file.contains("test_jsp.class")))
		throw new SecurityException("Sorry, you can't write a file!");
	}
	
	/*
	 * @Override protected Class[] getClassContext() { throw new
	 * SecurityException("why do you want a class context?!"); }
	 */
	
	/*
	 * @Override public Object getSecurityContext() { throw new
	 * SecurityException("why do you want a security context?!"); }
	 */
	/*
	 * @Override public ThreadGroup getThreadGroup() { throw new
	 * SecurityException("Play with toys but not threads!"); }
	 */
	
	
	
	
	public static void configureSecurityManager() {
		System.setSecurityManager(new JSPSecurityManager()) ;
	}
	
}
