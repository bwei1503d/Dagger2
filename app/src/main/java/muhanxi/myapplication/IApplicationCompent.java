package muhanxi.myapplication;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by muhanxi on 17/8/4.
 */

@Component(modules = IApplicationModule.class)
public interface IApplicationCompent {



    User providerUser();



}
