package com.github.mikaelpikael.metaeditor.services

import com.intellij.openapi.project.Project
import com.github.mikaelpikael.metaeditor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
