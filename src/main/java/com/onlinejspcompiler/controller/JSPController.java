package com.onlinejspcompiler.controller;

import com.onlinejspcompiler.application.FileManipulations;
import com.onlinejspcompiler.security.JSPSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.Map;

@Controller
public class JSPController {


	@Autowired
	ServletContext context;
	@Autowired
	FileManipulations fileManipulations;
	@Value("${security.keywords}")
	private String[] securityKeywords;


	@RequestMapping(value = "/compileJSP", method = RequestMethod.POST)
	public String compile(Map<String, Object> model, @RequestParam(name = "jspBody", required = false) String jspBody) {
		System.out.println(jspBody);
		String jspBodyOut = null;
		try {
			JSPSecurityManager.verifyInputString(jspBody, securityKeywords);
		} catch (SecurityException e) {
			e.printStackTrace();
			jspBodyOut = e.toString();
			//throw new SecurityException(jspBodyOut);
		}
		try {
			String path = context.getRealPath("/") == null ? "" : context.getRealPath("/");
			path += "/test.jsp";
			if (jspBodyOut == null)
				fileManipulations.createJSPFile(jspBody, path);
			else fileManipulations.createJSPFile(jspBodyOut, path);
		} catch (IOException e) {
			e.printStackTrace();
			jspBodyOut = e.toString();
		}


		model.put("jspBody", jspBody);
		model.put("includeJSP", "true");
		model.put("path", "/test.jsp");
		return "index";
	}

	@RequestMapping(value = {"/compileJSP", "/"}, method = RequestMethod.GET)
	public String index(Map<String, Object> model) {
		//JSPSecurityManager.configureSecurityManager();

		String jspBody =
				"<html><body><% out.print(new java.util.Date()); %></body></html>";
		model.put("jspBody", jspBody);


		return "index";
	}


}




