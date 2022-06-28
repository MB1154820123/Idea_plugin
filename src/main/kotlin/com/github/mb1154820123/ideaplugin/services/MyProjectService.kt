package com.github.mb1154820123.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.mb1154820123.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
