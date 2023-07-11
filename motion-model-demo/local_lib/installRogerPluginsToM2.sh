#linux maven command
maven="mvn"
#maven="C:\Program Files\apache-maven-3.6.0\bin\mvn"
$maven install:install-file -Dfile=roger-plugin-interfaces-1.3.0.jar -DgroupId=com.bbn.roger -DartifactId=roger-plugin-interfaces -Dversion=1.3.0 -Dpackaging=jar
$maven install:install-file -Dfile=roger-plugin-interfaces-1.3.0.pom -DgroupId=com.bbn.roger -DartifactId=roger-plugin-interfaces -Dversion=1.3.0 -Dpackaging=pom
