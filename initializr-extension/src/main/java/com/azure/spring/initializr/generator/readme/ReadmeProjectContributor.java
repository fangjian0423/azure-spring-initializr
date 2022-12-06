package com.azure.spring.initializr.generator.readme;

import io.spring.initializr.generator.project.contributor.MultipleResourcesProjectContributor;

public class ReadmeProjectContributor extends MultipleResourcesProjectContributor {

    public ReadmeProjectContributor() {
        super("classpath:readme");
    }
}
