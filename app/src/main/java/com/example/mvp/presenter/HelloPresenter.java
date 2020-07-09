package com.example.mvp.presenter;

import com.example.mvp.model.HelloModel;
import com.example.mvp.view.HelloView;

public class HelloPresenter implements Presenter {
    private HelloView view;
    private HelloModel model = new HelloModel();

    public HelloPresenter(HelloView view) {this.view = view; }

    @Override
    public void onCreate() {
        view.updateHelloLabel(model.pickRandomLabel());
    }
}
