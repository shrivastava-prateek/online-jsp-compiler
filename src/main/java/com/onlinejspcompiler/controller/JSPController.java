package com.onlinejspcompiler.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.onlinejspcompiler.application.FileManipulations;
import com.onlinejspcompiler.security.JSPSecurityManager;

@Controller
public class JSPController {
	


		@Autowired
		ServletContext context;
		@Autowired
		FileManipulations fileManipulations;
		@Value("${security.keywords}")
		private String[] securityKeywords;	
		
		
		@RequestMapping(value="/compileJSP",method=RequestMethod.POST)
		public String compile(Map<String, Object> model, @RequestParam(name="jspBody", required=false) String jspBody) {
				System.out.println(jspBody);
				String jspBodyOut = null;
				try {
				JSPSecurityManager.verifyInputString(jspBody,securityKeywords);
				}catch(SecurityException e) {
					e.printStackTrace();
					jspBodyOut = e.toString();
					//throw new SecurityException(jspBodyOut);
				}
				try {
				/*
				 * System.out.println("context.getContextPath()-"+context.getContextPath());
				 * System.out.println("context.getRealPath(\"/index.jsp\")-"+context.getRealPath
				 * ("/index.jsp"));
				 * for(String path: context.getResourcePaths("/")) {
				 * System.out.println("resource path:-"+path);
				 * }
				 * System.out.println("context.getResource(\"/\").getPath()-"+context.
				 * getResource("/").getPath());
				 * String path = context.getRealPath("/")==null?"":context.getRealPath("/");
				 * System.out.println(
				 * "context.getRealPath(context.getResource(\"/WEB-INF/\").getPath())-"+context.
				 * getRealPath(context.getResource("/WEB-INF/").getPath()));
				 * //String path =
				 * context.getResource("/WEB-INF/").getPath()==null?"":context.getResource(
				 * "/WEB-INF/").getPath();
				 * System.out.println("context.getRealPath(\"/\")-"+context.getRealPath("/"));
				 * Path currentDir = Paths.get("WEB-INF");
				 * //String path = currentDir.toAbsolutePath().resolve("test.jsp").toString();
				 * System.out.println("Using paths:- "+path);
				 * System.out.println(
				 * "this.getClass().getClassLoader().getResource(\"/\").toString()-"+this.
				 * getClass().getClassLoader().getResource("/").toString());
				 * System.out.println("this.getClass().getResource(\"/\").getPath()-"+this.
				 * getClass().getResource("/").getPath());
				 */
					String path = context.getRealPath("/")==null?"":context.getRealPath("/");
					path+="/test.jsp";
					if(jspBodyOut==null)
				fileManipulations.createJSPFile(jspBody, path);
					else fileManipulations.createJSPFile(jspBodyOut, path);
				}catch(IOException e) {
					e.printStackTrace();
					jspBodyOut = e.toString();
				}
			

			
			model.put("jspBody", jspBody);
			model.put("includeJSP", "true");
			model.put("path", "/test.jsp");
			return "index";
		}
		
		@RequestMapping(value= {"/compileJSP","/"},method=RequestMethod.GET)
		public String index(Map<String, Object> model) {
			//JSPSecurityManager.configureSecurityManager();
			
			  String jspBody =
			  "<html><body><% out.print(new java.util.Date()); %></body></html>";
			  model.put("jspBody", jspBody);
			 
		
			return "index";
		}
		
		
	}




