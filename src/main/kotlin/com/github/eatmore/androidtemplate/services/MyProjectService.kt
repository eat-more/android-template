package com.github.eatmore.androidtemplate.services

import com.github.eatmore.androidtemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
