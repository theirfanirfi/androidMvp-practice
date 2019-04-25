package com.irfanullah.practicingmvp;

public class UserPresenter implements UserClass.Presenter {

    private UserClass.View view;

    public UserPresenter(UserClass.View view) {
        this.view = view;
    }

    @Override
    public void processInput(String email, String name) {
        if(email.isEmpty() || name.isEmpty()){
            view.showFieldsEmptyError();
        }else {
            view.onSuccess();
        }
    }
}
