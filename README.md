# PMD Example with Maven Multi-Module Project

## Adding PMD to Jenkins Steps

### 1. Ensure the *Warnings Next Generation Plugin* Jenkins Plugin is installed.

<img src="img/plugininstall.png" width="800">

### 2. Add an *Execute Shell* build step invoking  *./mvnw pmd:pmd* 

<img src="img/buildstep.png" width="800">

### 3. Add a *Record compiler warnings and static analysis results* post-build action. 

<img src="img/postbuildstep.png" width="800">

### 4. Run a build, and enjoy the PMD Status Reports

<img src="img/pmdreport.png" width="800">

### 5. Optional - add a quality gate for notifications on new violations

<img src="img/qualitygate.png" width="800">

### 6. Optional - add Slack notifications on broken builds. 

Steps at: 

[https://github.com/jenkinsci/slack-plugin](https://github.com/jenkinsci/slack-plugin)

