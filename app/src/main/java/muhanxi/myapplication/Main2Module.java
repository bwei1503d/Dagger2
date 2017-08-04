package muhanxi.myapplication;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muhanxi on 17/8/4.
 */

@Module
public class Main2Module {


    public Main2Module(String name){

    }


    @Provides
    public User providerUser(){
        return new User();
    }


}
