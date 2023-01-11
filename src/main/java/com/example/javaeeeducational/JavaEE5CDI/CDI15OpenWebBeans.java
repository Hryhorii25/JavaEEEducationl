package JavaEE5CDI;

import org.apache.webbeans.config.WebBeansContext;
import org.apache.webbeans.spi.ContainerLifecycle;

import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;
import javax.inject.Named;
import java.awt.*;

//Openwebbeans це спеціальний інструмент Apache Tomcat  за допомогою якого можна піднімати контейнер сервлета із метода Main
public class CDI15OpenWebBeans {
    public static void main(String[] args) {

        //Блок коду для підняття сервлета через main метод
        ContainerLifecycle lifecycle = (ContainerLifecycle) WebBeansContext.currentInstance().getService(Container.class);
        lifecycle.startApplication(null);
        BeanManager beanManager = lifecycle.getBeanManager();
        Bean<?> bean = beanManager.getBeans("MainConteiner").iterator().next();
        MainConteiner mainConteiner = (MainConteiner) lifecycle.getBeanManager().getReference(bean,MainConteiner.class,beanManager.createCreationalContext(bean));
        mainConteiner.runBean();
        lifecycle.stopApplication(null);

    }
}

@Named
class MainConteiner{
    @Inject
    MyBean myBean;
    public void runBean(){
        myBean.print();
    }
}

class MyBean{
    public  void print(){
        System.out.println("hello ");
    }
}