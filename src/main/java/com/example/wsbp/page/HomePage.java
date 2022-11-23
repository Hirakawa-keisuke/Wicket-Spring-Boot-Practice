package com.example.wsbp.page;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.wicketstuff.annotation.mount.MountPath;

@WicketHomePage
@MountPath("Home")
public class HomePage extends WebPage {

    public HomePage() {
        var youModel = Model.of("Wicket-Spring-Boot");
        var youLabel = new Label("you", youModel);
        add(youLabel);

        var gakusekiModel = Model.of("b2201980");
        var gakusekiLabel = new Label("gakuseki", gakusekiModel);
        add(gakusekiLabel);

        var nameModel = Model.of("hirakawa_keisuke");
        var nameLabel = new Label("name", nameModel);
        add(nameLabel);
    }

}
