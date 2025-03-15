package lesson24.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ApplicationListener implements
        ServletContextListener,
        HttpSessionListener,
        HttpSessionAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("attributeAdded %s = %s".formatted(event.getName(), event.getValue()));
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("attributeRemoved %s = %s".formatted(event.getName(), event.getValue()));
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("attributeReplaced %s = %s".formatted(event.getName(), event.getValue()));
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("sessionCreated with id = %s".formatted(se.getSession().getId()));
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("sessionDestroyed with id = %s".formatted(se.getSession().getId()));
    }
}
