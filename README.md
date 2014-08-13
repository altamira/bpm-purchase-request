Altamira BPM Purchase Request
=============================

This project automates the Purchase Request business process at Altamira. 

To build the project follow this steps:

```
$ cd yo
$ npm install
$ bower install
$ cd bower_components/overthrow
$ npm install
$ grunt
$ cd ../..
$ grunt build
$ cd ..
$ mvn clean install -Parq-jbossas-remote
```

This project depends on [altamira-data-0.1.5-SNAPSHOT-classes](https://www.github.com/altamira/data), this module need to be in your local maven repository.

The unit tests are made by [Arquillian](http://arquillian.org) under [JBoss AS7](http://jbossas.jboss.org) remote container, so they need to be running first.

