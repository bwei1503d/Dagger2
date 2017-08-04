package muhanxi.myapplication;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

public class Main2Activity extends Activity {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



//        IApplication application = (IApplication)  getApplication() ;
//
//        application.mainCompent.inject(this);


        System.out.println("mainPresenter = " + mainPresenter);


    }
}
