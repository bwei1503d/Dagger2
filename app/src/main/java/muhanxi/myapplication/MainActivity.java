package muhanxi.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import dagger.Lazy;

public class MainActivity extends Activity {



//    @Named("t1")
    @Inject
    MainPresenter mainPresenter;

    @Inject
    User user ;

//    @Named("t2")
//    @Inject
//    MainPresenter mainPresenter1;

//    @Inject
//    MainPresenter mainPresenter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        mainPresenter = new MainPresenter();


//        DaggerMainCompent.builder().build().inject(this);

//        DaggerMainCompent.builder().mainModule(new MainModule("nihao")).build().inject(this);

//        DaggerMainCompent.builder().mainModule(new MainModule("nihao")).build().inject(this);

//        DaggerMainCompent.create().inject(this);


       IApplication application = (IApplication)  getApplication() ;

//        application.mainCompent.inject(this);

//        DaggerMainCompent.builder().main2Module(new Main2Module("1111")).mainModule(new MainModule("111",1)).build().inject(this);



        DaggerMainCompent.builder().mainModule(new MainModule("aaa",111)).iApplicationCompent(application.iApplicationCompent).build().inject(this);

        System.out.println("user = " + user);
//        System.out.println("mainPresenter1 = " + mainPresenter1);


        findViewById(R.id.ttt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("mainPresenter = " + mainPresenter);

//                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });


//        application.iApplicationCompent.





    }
}
