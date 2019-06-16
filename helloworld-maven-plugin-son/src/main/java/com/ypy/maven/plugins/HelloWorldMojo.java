package com.ypy.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

@Mojo(name = "helloworldson")
public class HelloWorldMojo extends AbstractMojo {

    @Parameter
    private String msg;

    @Parameter
    private List<String> options;

    // 启动入参的时候传递
    @Parameter(property = "args")
    private String args;

    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("hello world!");
        System.out.println("msg:" + msg);
        System.out.println("options:" + options);
        System.out.println("args:" + args);
    }
}
