package com.my.group.drtamiproject.api.services;

import io.kestros.commons.osgiserviceutils.services.ManagedService;

public interface SampleService extends ManagedService {

  String getMyServiceValue();

}