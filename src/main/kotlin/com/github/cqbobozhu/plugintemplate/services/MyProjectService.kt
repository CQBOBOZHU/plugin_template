package com.github.cqbobozhu.plugintemplate.services

import com.github.cqbobozhu.plugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
