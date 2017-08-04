package muhanxi.myapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by muhanxi on 17/8/4.
 */

@Module
public class IApplicationModule {




    @Provides
    public User providerUser(){
        return new User();
    }


}
