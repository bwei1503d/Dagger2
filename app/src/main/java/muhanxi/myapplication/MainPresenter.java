package muhanxi.myapplication;

import javax.inject.Inject;

/**
 * Created by muhanxi on 17/8/4.
 */

public class MainPresenter {


    public String name ;

    public int age;
//    @Inject
    public MainPresenter(String name){

        this.name = name;

    }



    public MainPresenter(int age){
        this.age = age;
    }


}
