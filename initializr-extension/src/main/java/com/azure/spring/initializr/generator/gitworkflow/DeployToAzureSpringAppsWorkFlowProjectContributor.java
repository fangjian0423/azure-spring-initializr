package com.azure.spring.initializr.generator.gitworkflow;

import io.spring.initializr.generator.project.contributor.MultipleResourcesProjectContributor;

public class DeployToAzureSpringAppsWorkFlowProjectContributor extends MultipleResourcesProjectContributor {

    public DeployToAzureSpringAppsWorkFlowProjectContributor() {
        // Improvement: 1. Support Gradle. 2. Support parameter like "${jdk-version}".
        // For quick test, not implement these features now.
        super("classpath:workflows/deploy-to-azure-spring-apps");
    }
}
