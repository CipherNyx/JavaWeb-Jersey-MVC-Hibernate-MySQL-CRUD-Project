package lk.jiat.webapp.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class ContextListener  implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext context = sce.getServletContext();
        context.setAttribute("BASE_URL",context.getContextPath() + "/");
        System.out.println("Context Listener Initialized");
        System.out.println("BASE_URL set to the context");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
