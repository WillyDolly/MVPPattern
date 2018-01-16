package com.popland.pop.mvppattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Contract.View{//activity serve as View
Button btn;
TextView tv;
Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
    }

    @Override
    public void initView() {
        btn = (Button)findViewById(R.id.btn);
        tv = (TextView)findViewById(R.id.tv);
        btn.setOnClickListener(new View.OnClickListener() {//View (user input) call Presenter
            @Override
            public void onClick(View view) {
                presenter.onClick();
            }
        });
    }

    @Override
    public void setViewData(String data) { //Presenter call View to update UI
        tv.setText(data);
    }
}
