package muhanxi.myapplication;

/**
 * Created by muhanxi on 17/8/4.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Inject;
import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Scope
@Retention(RUNTIME)
public @interface IScope {
}
