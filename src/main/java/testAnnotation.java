import java.lang.annotation.*;

@Deprecated
/**
 * @deprecated don't use this
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@interface MyAnnotation{
  String value();

  String name();


}