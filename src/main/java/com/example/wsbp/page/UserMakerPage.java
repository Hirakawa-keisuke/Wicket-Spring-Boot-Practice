package com.example.wsbp.page;

import org.apache.wicket.markup.html.WebPage;
import org.wicketstuff.annotation.mount.MountPath;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

@MountPath("UserMaker")
public class UserMakerPage extends WebPage {

    public UserMakerPage() {

        var userNameModel = Model.of("");
        var userPassModel = Model.of("");

        var toHomePageLink = new BookmarkablePageLink<>("toHome", HomePage.class);
        add(toHomePageLink);

        Form<Void> userInfoForm = new Form<Void>("userInfo") {
            @Override
            protected void onSubmit() {
                var userName = userNameModel.getObject();
                var userPass = userPassModel.getObject();
                var msg = "送信データ："
                        + userName
                        + ","
                        + userPass;
                System.out.println(msg);
                // この1行を追加
                setResponsePage(new UserMakerCompPage(userNameModel));
            }
        };
        add(userInfoForm);

        var userNameField = new TextField<>("userName", userNameModel);
        userInfoForm.add(userNameField);

        var userPassField = new PasswordTextField("userPass", userPassModel);
        userInfoForm.add(userPassField);

    }

}
