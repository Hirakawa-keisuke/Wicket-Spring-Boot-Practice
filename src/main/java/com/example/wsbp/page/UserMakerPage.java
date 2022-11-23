package com.example.wsbp.page;

import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.annotation.mount.MountPath;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

@MountPath("UserMaker")
public class UserMakerPage extends WebPage {

    public UserMakerPage() {
        var toHomePageLink = new BookmarkablePageLink<>("toHome", HomePage.class);
        add(toHomePageLink);

    }

}
