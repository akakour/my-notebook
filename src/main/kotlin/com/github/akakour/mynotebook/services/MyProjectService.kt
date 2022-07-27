package com.github.akakour.mynotebook.services

import com.intellij.openapi.project.Project
import com.github.akakour.mynotebook.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
