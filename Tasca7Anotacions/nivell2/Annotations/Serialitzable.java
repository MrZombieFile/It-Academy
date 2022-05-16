package Tasca7Anotacions.nivell2.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface Serialitzable {
    String directory();

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface JsonSerializable{
        public String directory() default "";
    }
}
