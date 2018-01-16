package com.popland.pop.mvppattern;

/**
 * Created by hai on 16/01/2018.
 */

public class Model implements Contract.Model {
    @Override
    public String getData() {
        return "Hello MVP";
    }
}
