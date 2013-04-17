/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yskts.multiconfig.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 *
 * @author niwong
 */
public class WebInit implements WebApplicationInitializer {
    
    public static final String CONFIG_SCAN = "com.yskts.multiconfig.web.config";
    public static final String APP_SERVLET = "appServlet";
    public static final String SERVLET_MAPPING = "*.html";

    /**
     * Sets up the WebApplicationContext when the application starts up.
     *
     * @param servletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(final ServletContext servletContext) throws ServletException {
        
        assert servletContext != null;

        // Get a Spring AnnotationConfigWebApplicationContext
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();

        // Scan and read the Java configuration classes
        rootContext.scan(CONFIG_SCAN);

        // Assign the WebApplicationContext to the ServletContext
        servletContext.addListener(new ContextLoaderListener(rootContext));

        // Create a new Servlet so we can listen for requests
        ServletRegistration.Dynamic appServlet = servletContext.addServlet(
                APP_SERVLET,
                new DispatcherServlet(rootContext));

        // Listen for request patterns
        appServlet.setLoadOnStartup(1);
        appServlet.addMapping(SERVLET_MAPPING);
    }
}
