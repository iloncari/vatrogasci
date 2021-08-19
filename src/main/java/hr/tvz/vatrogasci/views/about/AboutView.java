package hr.tvz.vatrogasci.views.about;

import java.util.Optional;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("About")
@Route(value = "about")
@RouteAlias(value = "")
public class AboutView extends Div {

    public AboutView() {
        addClassName("about-view");
        add(new Text("Content placeholder"));
        Optional<String> sOpt = Optional.ofNullable("dans");
        if(sOpt.isEmpty()) {
        	add(new Text("dsds"));
        }
        	
    }

}
