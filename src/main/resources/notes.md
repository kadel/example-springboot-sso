
		<dependency>
			<groupId>org.keycloak</groupId>
			<artifactId>keycloak-spring-boot-starter</artifactId>
		</dependency>



    <dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.keycloak.bom</groupId>
				<artifactId>keycloak-adapter-bom</artifactId>
				<version>11.0.2</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>





-Djavax.net.ssl.trustStore=cacerts



keycloak.auth-server-url=https://keycloak-springboot-sso.apps-crc.testing/auth/
keycloak.realm=springboot
keycloak.resource=login-app

keycloak.public-client=true
keycloak.security-constraints[0].authRoles[0]=user
keycloak.security-constraints[0].securityCollections[0].patterns[0]=/secret/*



keytool -importcert -file cert.crt -cacerts



/usr/lib/jvm/java-15-openjdk/lib/security/cacerts
