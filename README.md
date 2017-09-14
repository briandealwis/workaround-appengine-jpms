## Example to use JPMS compatible jars with Jetty 9.3 / App Engine

The App Engine Standard for Java 8 development environment uses
Jetty 9.3 for local run and staging.  Unfortunately Jetty 9.3 raises
a fatal error when [scanning jars with Java 9 JPMS
metadata](https://github.com/eclipse/jetty.project/issues/1692) that
prevents running and debugging with the local development server,
and deploying to App Engine.  This has been filed as 
[Issue #65200034](https://issuetracker.google.com/issues/65200034).

This project demonstrates a workaround that uses the maven-shade-plugin
to shades the JPMS-friendly jars into a so-called _uberjar_ and
removes the problematic `module-info.class` files.  This workaround 
should only be necessary until [Issue #65200034](https://issuetracker.google.com/issues/65200034)
is resolved.

This approach requires a 2-step build:

  1. Build and install the shaded uberjar:

      $ cd eclipse-yasson-uberjar; mvn install

  2. Build and package your normal war:

      $ cd example-consumer-war; mvn appengine:run
