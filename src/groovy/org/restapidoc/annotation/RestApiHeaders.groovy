package org.restapidoc.annotation
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is to be used on your method and contains an array of ApiHeade
 * @see RestApiHeader
 * @author Fabio Maffioletti
 *
 */
@Documented
@Target(value=ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestApiHeaders {

    /**
     * An array of ApiHeader annotations
     * @see RestApiHeader
     * @return
     */
    public RestApiHeader[] headers();

}