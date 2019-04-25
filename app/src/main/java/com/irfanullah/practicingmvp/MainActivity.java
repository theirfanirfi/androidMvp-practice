package com.irfanullah.practicingmvp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements UserClass.View {

   // private UserClass.View view;
    private UserPresenter presenter;
    private Context context;
    private TextView tx;
    int i =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        tx = findViewById(R.id.textView);
        presenter = new UserPresenter(this);

        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i%2 == 0) {
                    i++;
                    presenter.processInput("", "");
                }else {
                    i++;
                    presenter.processInput("admain@admin.com", "ADMIN KHAN");
                }
            }
        });
    }

    @Override
    public void showToast() {

    }

    @Override
    public void showNameError() {

    }

    @Override
    public void showEmailError() {

    }

    @Override
    public void showFieldsEmptyError() {
        Toast.makeText(context, "none of the field can be empty",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSuccess() {
        Toast.makeText(context, "Success",Toast.LENGTH_LONG).show();
    }
}
