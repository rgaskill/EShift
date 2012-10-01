=Introduction=

I am using JBoss7 and h2 for the development environment.

= Details =

==H2 Database engine==
[http://www.h2database.com/html/main.html]

For the windows install just select H2/H2 Console (Command Line) from the windows start menu to start the server.

From the h2 console set the sa password.  

{{{
alter user sa set password 'admin1';
}}}

You then can run the CreateSchema main located in the soruce at EShift-jpa/src/test/java/CreateSchema.  If you want to setup a different eshift admin user change the code here.

==Jboss-as-7.1.1.FINAL==

Download and unzip to your preferred location on your hardrive.  

Add an admin user

{{{
$ $JBOSS_HOME/bin/add-user.sh 

What type of user do you wish to add? 
 a) Management User (mgmt-users.properties) 
 b) Application User (application-users.properties)
(a): a

Enter the details of the new user to add.
Realm (ManagementRealm) : 
Username : eshiftadmin
Password : 
Re-enter Password : 
}}}

From the bin directory run the standalone script to start the server in standalone mode.  

{{{
$ $JBOSS_HOME/bin/standalone.sh 
}}}

Add the default datasource and security-realm by running the EShift-jboss pom

{{{
$ cd $ESHIFT_ROOT/EShift-jboss
$ mvn install
}}}


To deploy the current eshift war

{{{
$ cd $ESHIFT_ROOT
$ mvn clean install -P deploy
}}}