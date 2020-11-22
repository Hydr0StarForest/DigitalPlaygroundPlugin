# PaperMC Plugins Template
 Just a template to make plugins for PaperMC

This project is a template to start coding your plugin for PaperMC / Bukkit in no time.

If you're going to use it for the first time, please read this carefully.

### Creating environmemnt
First you need to make the environment to create plugins!

1. Install `OpenJDK 8` from [here](https://adoptopenjdk.net/)
2. Install `Maven` from [here](https://maven.apache.org/download.cgi)
3. Setup your code editor to write plugins in Java and maven to compile. (If you are using VSCode, then install `Java Extension Pack` from [here](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack))

If you don't know how to do please Google it by yourself.

If you are done or you already have an environment to work, go on.

### Changing the package file.
Open `pom.xml`.

Change the property to your needs.

Here is a list of what you would like to change.

1. groupId (This is used to identify your project. It can be anything but this should be the save directory from `src/main/java/YOUR_GROUP_ID`)
2. artifactId (This is the name of the jar without version)
3. name
4. version
5. description

### Plugin configuration


Change the property to your needs.

Here is a list of what you would like to change.

1. main (This should be the first file to be loaded)
2. author (Your name, obviously)
3. commands (Go and search for references)
