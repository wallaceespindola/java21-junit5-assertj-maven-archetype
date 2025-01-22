<p>
    <img src="https://cdn.icon-icons.com/icons2/2699/PNG/512/java_logo_icon_168609.png" alt="Java" width="300"/>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <img src="https://upload.wikimedia.org/wikipedia/commons/5/59/JUnit_5_Banner.png" alt="Junit5" width="200"/>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <img src="https://assertj.github.io/doc/images/assertj-db_icon.png" alt="AssertJ" width="350"/>
    &nbsp&nbsp&nbsp
    <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Apache_Maven_logo.svg/2560px-Apache_Maven_logo.svg.png" alt="Maven" width="200"/>
</p>

# Java 21 + JUnit 5 + AssertJ: Quick Start Maven Archetype

![Apache 2.0 License](https://img.shields.io/badge/License-Apache2.0-orange)
![Java](https://img.shields.io/badge/Built_with-Java-blue)
![Junit5](https://img.shields.io/badge/Built_with-Junit5-teal)
![AssertJ](https://img.shields.io/badge/Powered_by-AssertJ-pink)
![Hamcrest](https://img.shields.io/badge/Powered_by-Hamcrest-purple)
![Maven](https://img.shields.io/badge/Powered_by-Maven-green)

Maven archetype to create a quick start project configured for Java 21, Junit 5 and AssertJ.

## Install archetype in local repository

Once you have cloned the repository locally. Just run the maven command below to install the archetype.

``` shell
mvn clean install
```

## Example using the archetype

When the archetype has been installed locally you can create a project using the command below. Just replace the parameter values with the actual values you want to use.

``` shell
 mvn archetype:generate -DarchetypeGroupId=com.wtech.archetypes \
                        -DarchetypeArtifactId=java21-junit5-assertj-maven-archetype \
                        -DarchetypeVersion=1.0.0-SNAPSHOT \
                        -DgroupId=com.wtech.app \
                        -DartifactId=a-test-project \
                        -Dversion=1.0.0-SNAPSHOT \
                        -DinteractiveMode=false
```

## References

* [Maven](https://maven.apache.org)
* [Maven Archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html)
* [JUnit 5](https://junit.org/junit5/)
* [AssertJ](https://assertj.github.io/doc/)
* [Hamcrest](http://hamcrest.org/JavaHamcrest/)

## Author

- Wallace Espindola, Sr. Software Engineer / Java & Python Dev
- E-mail: wallace.espindola@gmail.com
- LinkedIn: https://www.linkedin.com/in/wallaceespindola/
- Gravatar: https://gravatar.com/wallacese
- Website: https://wtechitsolutions.com/

## License

- This project is released under the Apache 2.0 License. See the [LICENSE](LICENSE) file for details.
- Copyright © 2024 [Wallace Espindola](https://github.com/wallaceespindola/).

