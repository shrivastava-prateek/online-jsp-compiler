package com.onlinejspcompiler.security;

import java.net.InetAddress;
import java.security.Permission;
import java.util.Collection;

import org.ahocorasick.trie.Emit;
import org.ahocorasick.trie.Trie;


public class JSPSecurityManager extends SecurityManager {

	private static JSPSecurityManager jspSecurityManager;

	private JSPSecurityManager() {
		
	}

	
	public static JSPSecurityManager getJSPSecurityManagerInstance() {
		if (jspSecurityManager == null)
			jspSecurityManager = new JSPSecurityManager();
		return jspSecurityManager;
	}

	// Work in Progress
	
	@Override
	public void checkPermission(Permission permission) {
		//super.checkPermission(permission);
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
	public void checkPrintJobAccess() {
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

	/*
	 * @Override public void checkDelete(String file) {
	 * System.out.println("file name: "+file); if(!(file.contains("test_jsp.java")
	 * || file.contains("test_jsp.class"))) throw new
	 * SecurityException("Dude! I know you like deleting/destroying things, but here these are not allowed!"
	 * ); }
	 */

	/*
	 * @Override
	 * public void checkLink(String lib) {
	 * throw new SecurityException("Dude! No Linking!");
	 * }
	 */

	@Override
	public void checkListen(int port) {
		throw new SecurityException("Don't try to sneak on other ports!");
	}

	@Override
	public void checkMemberAccess(Class<?> clazz, int which) {
		throw new SecurityException("No Access related snippets please!");
	}

	/*
	 * @Override public void checkPropertiesAccess() { throw new
	 * SecurityException("Don't Play with System!!"); }
	 */

	/*
	 * @Override public void checkPropertyAccess(String key) {
	 * System.out.println("Property Key: "+ key); throw new
	 * SecurityException("Don't try to sneak on system properties!"); }
	 */

	/*
	 * @Override public void checkSetFactory() { throw new
	 * SecurityException("Dude! Sockets are not for kids!"); }
	 */

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

	/*
	 * @Override public void checkWrite(String file){
	 * System.out.println("filestring: "+file); if(!(file.contains("test.jsp") ||
	 * file.contains("test_jsp.java") || file.contains("test_jsp.class"))) throw new
	 * SecurityException("Sorry, you can't write a file!"); }
	 */

	@Override
	protected Class[] getClassContext() {
		throw new SecurityException("why do you want a class context?!");
	}

	@Override
	public Object getSecurityContext() {
		throw new SecurityException("why do you want a security context?!");
	}

	/*
	 * @Override public ThreadGroup getThreadGroup() { throw new
	 * SecurityException("Play with toys but not threads!"); }
	 */

	public static void verifyInputString(String jspBody, String[] securityKeywords) {
		Trie trie = Trie.builder().onlyWholeWords().addKeywords(securityKeywords).build();
		Collection<Emit> emits = trie.parseText(jspBody);
		if (emits.size() != 0) {
			emits.forEach(System.out::println);
			throw new SecurityException("Security Violation:" + emits.toString());
		}

	}

	public static void configureSecurityManager() {
		
		//System.setProperty("java.security.policy", "security.policy");
		System.setSecurityManager(getJSPSecurityManagerInstance());
	}

}
