package com.askill.eshift.auth;

import org.jboss.security.annotation.Authentication;
import org.jboss.security.annotation.Module;
import org.jboss.security.annotation.ModuleOption;
import org.jboss.security.auth.spi.UsersRolesLoginModule;

@Authentication(modules={@Module(code = UsersRolesLoginModule.class, options = {@ModuleOption})})
public class EShiftAuthentication {

}
