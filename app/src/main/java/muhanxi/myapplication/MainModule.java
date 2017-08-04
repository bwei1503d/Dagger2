package muhanxi.myapplication;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muhanxi on 17/8/4.
 */

@Module
public class MainModule {


    private String name;
    private int age;
    public MainModule(String name,int age){
        this.name = name;
        this.age = age ;
    }

//
//
//    @Provides
//    public String providerString(){
//        return name;
//    }
//
//
//    @Provides
//    public int providerInt(){
//        return age;
//    }
//


//    @Named("t1")
    @Provides
    public MainPresenter providerMainPresenter(){
        return  new MainPresenter(name);
    }

//    @Named("t2")
//    @Provides
//    public MainPresenter providerMainPresenterAge(){
//        return  new MainPresenter(age);
//    }


    @Provides
    public String createString(){
        return "111" ;
    }
}
