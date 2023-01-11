package JavaEE4WebXML;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//https://docs.oracle.com/javaee/6/tutorial/doc/gjcut.html

//Servlet(lisener) Слухач використовується для прослуховування подій в веб - контейнерах, наприклад, при створенні сеансу,
//        або помістити атрибут сеансу або якщо ви пассивации і активувати в іншому контейнері, щоб підписатися на
//        ці події ви можете налаштувати слухача web.xml, для приклад HttpSessionListener.

public class WebXml11Listeners implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("init context");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("destroy context");

    }


}

//Блок коду який потрібно прописати в xml файлі для підключення listeners
//<lisener>
//<lisener-class>WebXmlListeners<lisener-class>
//<lisener>