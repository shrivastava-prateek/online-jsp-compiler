package com.onlinejspcompiler.configuration;

import com.onlinejspcompiler.security.JSPSecurityManager;

public class WebAppInitialization {
	
	public void configureSecurityManager() throws Exception {
		  System.out.println("Init method after properties are set");
		  System.setSecurityManager(JSPSecurityManager.getJSPSecurityManagerInstance());
		}

}
