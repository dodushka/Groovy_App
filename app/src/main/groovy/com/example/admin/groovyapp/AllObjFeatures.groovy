package com.example.admin.groovyapp

import com.example.admin.groovyapp.models.Person
import groovy.transform.CompileStatic

@CompileStatic
class AllObjFeatures {
    private static final String LOG_TAG = AllObjFeatures.class.getSimpleName();

    public static void withFeature() {
        def daniel = new Person();
        daniel.with {
            firstName = 'Daniel'
            lastName = 'Waterman'
            sex = 'male'
            print firstName
        }

    }


}