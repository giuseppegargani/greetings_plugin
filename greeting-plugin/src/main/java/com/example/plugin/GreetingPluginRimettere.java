package com.example.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GreetingPluginRimettere implements Plugin<Project> {
    public void apply(Project project) {

        /*project.android {

            defaultConfig {
                applicationId "com.example.jsonreport"
                minSdk 24
                targetSdk 32
                versionCode 1
                versionName "1.0"

                testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
            }

            testVariants.all { variant ->
                    variant.connectedInstrumentTest.doLast {
                println "The name of the test type: $connectedInstrumentTest.name"
                println "The type of test $connectedInstrumentTest.class"
            }
                project.connectedAndroidTest.finalizedBy(':instrumentedreport:ucoodeTest')
                project.assembleDebugAndroidTest.finalizedBy(':instrumentedreport:ucoodeTest')
            }

            testOptions {

                //testOrchestrator
                execution 'ANDROIDX_TEST_ORCHESTRATOR'

                unitTests.all {

                    ignoreFailures = true

                    beforeTest { descriptor ->
                            logger.lifecycle("Beppe Running test: " + descriptor)
                    }
                    afterTest { desc, result ->
                            logger.lifecycle("************ Beppe: NOME TEST: $desc e RISULTATO TEST: $result")
                    }

                    beforeSuite { desc ->
                            println("Si mette in ascolto $desc")
                    }
                    afterSuite { desc, result ->
                        if (!desc.parent) { // will match the outermost suite
                            def output = "Results: ${result.resultType} (${result.testCount} tests, ${result.successfulTestCount} passed, ${result.failedTestCount} failed, ${result.skippedTestCount} skipped)"
                            def startItem = '|  ', endItem = '  |'
                            def repeatLength = startItem.length() + output.length() + endItem.length()
                            println('\n' + ('-' * repeatLength) + '\n' + startItem + output + endItem + '\n' + ('-' * repeatLength))
                        }
                    }
                    //granularità in console dei risultati del test (verificato e 3 corrisponde al singolo metodo)
                    testLogging {
                        minGranularity 3
                        maxGranularity 3
                    }
                    onOutput { descriptor, event ->
                            logger.lifecycle("Beppe Test: " + descriptor + " produced standard out/err: " + event.message )
                    }


                }


            }
        }*/

        project.getTasks().register("greet", task -> {
            task.doLast(s -> System.out.println("Ciao dal plugin 'com.example.plugin.greeting'"));
        });
    }
}
