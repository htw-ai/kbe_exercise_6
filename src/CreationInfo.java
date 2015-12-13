import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by timol on 10.12.2015.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface CreationInfo {

    String author() default "Timo Lingnau, Christoph Schulze";
    String description();
    String[] tags() default {};
    Class baseclass() default Object.class; //Da alle Klassen vom Typ Object erben
    Class[] interfaces() default {}; //Da nicht zwingend ein Interface vorhanden ist



}
