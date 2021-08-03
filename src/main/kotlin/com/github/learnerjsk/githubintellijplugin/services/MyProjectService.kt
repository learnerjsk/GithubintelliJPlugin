package com.github.learnerjsk.githubintellijplugin.services

import com.github.learnerjsk.githubintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
