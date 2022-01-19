package ma.education.tp.annotations;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Programmer {
    abstract int id();
    String name();
}
