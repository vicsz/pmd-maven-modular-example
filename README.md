# PMD Example with Maven Multi-Module Project

## Adding PMD to Jenkins Steps

### Ensure the *Warnings Next Generation Plugin* Jenkins Plugin is installed.

<img src="img/plugininstall.png" width="800">

### Add an *Execute Shell* build step invoking  *./mvnw pmd:pmd* 

<img src="img/buildstep.png" width="800">

### Add a *Record compiler warnings and static analysis results* post-build action. 

<img src="img/postbuildstep.png" width="800">

### Run a build, and enjoy the PMD Status Reports

<img src="img/pmdreport.png" width="800">