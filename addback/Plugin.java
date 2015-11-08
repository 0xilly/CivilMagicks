package us.illyohs.mod.civilmagiks.common.core.plugin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface Plugin {

    String id();

    String name() default "";

    String author() default "";

    String description() default "";

    String modsRequired() default "";

    String pluginsRequierd() default "";

    boolean isOptional() default true;

    boolean isEnabled() default true;
}
