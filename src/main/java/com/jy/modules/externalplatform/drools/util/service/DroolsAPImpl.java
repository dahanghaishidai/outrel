package com.jy.modules.externalplatform.drools.util.service;

import java.util.HashMap;
import java.util.List;

import com.jy.modules.externalplatform.drools.util.DroolsUtil;
import com.jy.platform.api.drools.DroolsAPI;

public class DroolsAPImpl
implements DroolsAPI
{


public DroolsAPImpl() {}

public HashMap<String, Object> doDrools(String ruleListEnName, List<?> insertObjects, HashMap<String, ?> globalServices)
{
  String path = "drools/" + ruleListEnName + ".drl";
  HashMap<String, Object> result = DroolsUtil.doDrools(path, insertObjects, globalServices);
  return result;
}
}
