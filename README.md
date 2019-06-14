# PMD Example with Maven Multi-Module Project

## Adding PMD to Jenkins Steps

### Ensure the *Warnings Next Generation Plugin* Jenkins Plugin is installed.

### Add an *Execute Shell* build step invoking  *./mvnw pmd:pmd* 

### Add a *Record compiler warnings and static analysis results* post-build action. 

<img src="img/buildstep.png" width="800">
<img src="img/postbuildstep.png" width="800">
<img src="img/pmdreport.png" width="800">