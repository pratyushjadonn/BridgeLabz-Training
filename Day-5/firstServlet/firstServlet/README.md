# firstServlet — Basic Servlet Example (Maven layout)

## Structure
```
firstServlet/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── HelloServlet.java
│       └── webapp/
│           ├── index.html
│           └── WEB-INF/
│               └── web.xml
└── README.md
```

## Note on servlet API version

This uses `javax.servlet`, which works with **Tomcat 9 and earlier**. For
**Tomcat 10+**, switch the dependency in `pom.xml` to
`jakarta.servlet:jakarta.servlet-api:5.0.0` and change the imports in
`HelloServlet.java` from `javax.servlet` to `jakarta.servlet`. See the
comment in `pom.xml` for the exact swap.

## Run in IntelliJ IDEA

1. **File → Open** and select this folder (the one with `pom.xml`).
   IntelliJ will detect it as a Maven project — click "Load Maven Project"
   if prompted.
2. **Run → Edit Configurations → + → Tomcat Server → Local**
   (requires IntelliJ Ultimate, or the free "Smart Tomcat" plugin on
   Community edition).
3. Point "Application server" at your local Tomcat install if not already
   configured.
4. In the **Deployment** tab of the run configuration, click **+ → Artifact**
   and choose `firstServlet:war` (or `firstServlet:war exploded` for faster
   dev reloads). Set the application context to `/firstServlet`.
5. Click **Run** (▶). IntelliJ builds, deploys, and opens your browser.
6. Visit:
   - http://localhost:8080/firstServlet/
   - http://localhost:8080/firstServlet/hello

## Run from the command line (no IDE)

```bash
mvn package
cp target/firstServlet.war /path/to/tomcat/webapps/
/path/to/tomcat/bin/startup.sh
```

Then visit the same URLs above.

## Troubleshooting

- **404**: confirm the app context is `/firstServlet` and `HelloServlet.class`
  is actually inside the deployed WAR (`target/firstServlet.war` should
  contain `WEB-INF/classes/HelloServlet.class` after `mvn package`).
- **500 / ClassNotFoundException**: servlet-api version mismatch with your
  Tomcat version — see the note above.
- **Port conflict**: change the port in `conf/server.xml`, or in IntelliJ's
  Tomcat run configuration under the "Server" tab.
