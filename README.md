# PMD Example with Maven Multi-Module Project

## Running PMD Check 

PMD Check will verify (and the break the build if needed) if code breaks current violation thresholds:

Number of ways exists to run it :

### 1. Directly via pmd:check

```sh
#mvn pmd:check

```

### 2. As part of Java Verify phase (automatically)

```sh
#mvn verify
```

or

```sh
#mvn install
```

Note: command can be run both at the project root level, as well as the submodule level.

## Running PMD Report

PMD Report create (and the break the build if needed) if code breaks current violation thresholds:

```sh
#mvn pmd:pmd
```

PMD Html Report will be generated in: {module_name}/target/site/pmd.html

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

## Updating Custom Rules 

### 1. Modify or Add Custom Rules in the pmd/src directory

### 2. Rebuild the custom rules 

```sh
cd pmd
mvn package
```

### 3. Update the pmd/pmd-custom-ruleset.xml with the new rules (if needed)

### 4. Commit the updated pmd/target/pmd-custom-rules-1.0.jar file to source control