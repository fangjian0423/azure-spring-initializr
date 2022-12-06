package com.azure.spring.initializr.generator.readme;

import io.spring.initializr.generator.project.contributor.ProjectContributor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadmeProjectContributor implements ProjectContributor {
    @Override
    public void contribute(Path projectRoot) throws IOException {
        Path file = Files.createFile(projectRoot.resolve("README.md"));
        Files.writeString(file, "Hello World.");
    }
}
