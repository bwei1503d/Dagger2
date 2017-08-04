package muhanxi.myapplication;

import android.app.Application;

/**
 * Created by muhanxi on 17/8/4.
 */

public class IApplication extends Application {

    MainCompent mainCompent ;
    public IApplicationCompent iApplicationCompent;

    @Override
    public void onCreate() {
        super.onCreate();

        iApplicationCompent = DaggerIApplicationCompent.builder().build();

//        mainCompent = DaggerMainCompent.builder().mainModule(new MainModule("111",1)).build();

    }
}
