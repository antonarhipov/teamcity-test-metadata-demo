package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2018_2.*
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v2018_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2018_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'TestMetadataDemo'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("TestMetadataDemo")) {
    expectSteps {
        gradle {
            tasks = "clean build"
            buildFile = ""
            gradleWrapperPath = ""
        }
    }
    steps {
        insert(1) {
            script {
                executionMode = BuildStep.ExecutionMode.RUN_ON_FAILURE
                scriptContent = """echo "##teamcity[publishArtifacts 'pictureForAttention.png']""""
            }
        }
    }
}
