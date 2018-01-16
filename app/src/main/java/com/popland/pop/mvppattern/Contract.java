package com.popland.pop.mvppattern;

/**
 * Created by hai on 16/01/2018.
 */

public interface Contract {//set all rules for each components in M - V - P

    interface View{
        void initView();
        void setViewData(String data);
    }

    interface Presenter{
        void onClick();
    }

    interface Model{
        String getData();
    }
}
