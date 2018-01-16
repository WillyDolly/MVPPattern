package com.popland.pop.mvppattern;

/**
 * Created by hai on 16/01/2018.
 */

public class Presenter implements Contract.Presenter {//bridge for interaction between View & Model)
Model model;
Contract.View view;

    public Presenter(Contract.View v){
        view = v;
        initPresenter();
    }

    public void initPresenter(){
        view.initView();//initialize Views
        model = new Model();
    }

    @Override
    public void onClick() {
        String data = model.getData();//Presenter call Model to get data
        view.setViewData(data);//Presenter call View to update UI
    }
}
