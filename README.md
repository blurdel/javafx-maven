# javafx-maven
Create JavaFX applications using maven

https://openjfx.io/openjfx-docs/#maven

mvn clean javafx:run


Add the PATH_TO_FX path to Eclipse -> Preferences -> Run/Debug -> String Substitution -> New...  
PATH_TO_FX = /home/user/Programs/javafx-sdk-17.0.7/lib

To run in STS/Eclipse, add VM arguments in your Run Configuration  
--module-path ${PATH_TO_FX} --add-modules=javafx.controls,javafx.fxml
