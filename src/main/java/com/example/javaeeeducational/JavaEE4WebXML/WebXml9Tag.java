package JavaEE4WebXML;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

//Створення власного тега через java
public class WebXml9Tag extends SimpleTagSupport{

String name;

    public void setName(String name) {
        this.name = name;
    }


    //Метод в якому прописується логіка тега
    @Override
    public void doTag() throws JspException, IOException {
        getJspContext().getOut().print("hello");

    }
}









