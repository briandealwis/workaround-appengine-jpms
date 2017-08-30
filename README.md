## Example demonstrating failure with JPMS compatible jars

The App Engine Standard for Java 8 development environment uses
Jetty 9.3 for local run and staging.  Unfortunately Jetty 9.3 raises
a fatal error when [scanning jars with Java 9 JPMS
metadata](https://github.com/eclipse/jetty.project/issues/1692).

This project demonstrates the problem using the `javax.json.bind` APIs
with the Eclipse Yasson implementation.

To reproduce:

  1. Run the project

      $ cd example-consumer-war; mvn clean appengine:run
