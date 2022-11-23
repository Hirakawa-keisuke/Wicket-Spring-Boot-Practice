package com.example.wsbp.page;

import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.annotation.mount.MountPath;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;

@MountPath("UserMaker")
public class UserMakerPage extends WebPage {

    public UserMakerPage() {
        var toHomePageLink = new BookmarkablePageLink<>("toHome", HomePage.class);
        add(toHomePageLink);

        var userInfoForm = new Form<>("userInfo");
        add(userInfoForm);

        var userNameField = new TextField<>("userName");
        userInfoForm.add(userNameField);

        var userPassField = new PasswordTextField("userPass");
        userInfoForm.add(userPassField);
    }

}
