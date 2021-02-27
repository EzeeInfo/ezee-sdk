package com.ezeeinfo.client;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ArchitectureTest {
    @Test
    public void testModelClasses() {
        JavaClasses jc = new ClassFileImporter().importPackages("com.ezeeinfo");

        ArchRule r1 = classes()
                .that()
                .resideInAPackage("..model..")
                .should().beTopLevelClasses()
                .andShould().bePublic()
                .andShould().haveOnlyFinalFields()
                .andShould().dependOnClassesThat().resideInAnyPackage("java.lang");

        r1.check(jc) ;
    }
}
