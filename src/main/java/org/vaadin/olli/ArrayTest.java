package org.vaadin.olli;

import java.util.List;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.Synchronize;
import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the array-test.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("array-test")
@HtmlImport("array-test.html")
public class ArrayTest extends PolymerTemplate<ArrayTest.ArrayTestModel> {

    /**
     * Creates a new ArrayTest.
     */
    public ArrayTest() {
        getElement().synchronizeProperty("itemlist","itemlist-changed");
        getElement().synchronizeProperty("itemlist","changed");
        getElement().synchronizeProperty("itemlist","change");
        getElement().addPropertyChangeListener("itemlist", e->{
            System.out.println("Itemlist changed: " + getItems());
        });
    }


    @Synchronize(value = {"itemlist-changed"}, property="itemlist")
    public String getItems() {
        String itemlist = getElement().getProperty("itemlist");
        return itemlist;
    }

       /**
     * This model binds properties between ArrayTest and array-test.html
     */
    public interface ArrayTestModel extends TemplateModel {

    }
}
