package muhanxi.myapplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by muhanxi on 17/8/4.
 */


@Component(modules = {MainModule.class},dependencies = IApplicationCompent.class )
public interface MainCompent {


    void inject(MainActivity mainActivity);

    String createString();

//    void inject(Main2Activity main2Activity);

}
