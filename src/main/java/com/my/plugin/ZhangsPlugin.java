package com.my.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "zhangsplugin",defaultPhase = LifecyclePhase.PACKAGE)
public class ZhangsPlugin extends AbstractMojo {
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("------#---Hello My Plusgin----------");
    }
}
