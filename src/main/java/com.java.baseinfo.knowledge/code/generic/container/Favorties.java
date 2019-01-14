package com.java.baseinfo.knowledge.code.generic.container;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.HashMap;
import java.util.Map;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/14<p>
// -------------------------------------------------------

public class Favorties {

    private Map<Class<?>, Object> favories = new HashMap<>();

    public <T> void putFavories(Class<T> type, T instance) {
        if (type == null) {
            throw new NullPointerException("type is null");
        }
        favories.put(type, instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favories.get(type));
    }

    public static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
        Class<?> annotationType = null;

        try {
            annotationType = Class.forName(annotationTypeName);

            return element.getAnnotation(annotationType.asSubclass(Annotation.class));
        } catch (ClassNotFoundException e) {
            System.out.printf("ClassNotFoundException.exception:" + e);
            return null;
        }
    }
}