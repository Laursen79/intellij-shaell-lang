package com.github.laursen79.intellijshaelllang.services

import com.intellij.openapi.project.Project
import com.github.laursen79.intellijshaelllang.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
