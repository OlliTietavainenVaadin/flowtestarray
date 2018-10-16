package org.vaadin.olli;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        VerticalLayout vl = new VerticalLayout(new H1("Array test"));
        ArrayTest arrayTest = new ArrayTest();
        vl.add(arrayTest);
        Button button = new Button("get synchronized property", e->{
            Notification.show(arrayTest.getItems());
        });
        add(vl, button);
    }
}
