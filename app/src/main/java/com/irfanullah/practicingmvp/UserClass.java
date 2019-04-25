package com.irfanullah.practicingmvp;

public interface UserClass {

    interface View {
        void showToast();
        void showNameError();
        void showEmailError();
        void showFieldsEmptyError();
        void onSuccess();
    }

    interface Presenter {
        void processInput(String email, String name);
    }
}
