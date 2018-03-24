package com.jy.modules.externalplatform.drools.sysrulethenconfig.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.drools.sysrulethenconfig.dto.SysRuleThenConfigDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;

@MyBatisRepository
public abstract interface SysRuleThenConfigDao
{
  public abstract List<SysRuleThenConfigDTO> searchSysRuleThenConfigByPaging(Map<String, Object> paramMap);
  
  public abstract List<SysRuleThenConfigDTO> searchSysRuleThenConfig(Map<String, Object> paramMap);
  
  public abstract SysRuleThenConfigDTO findSysRuleThenConfigByPrimaryKey(String paramString);
  
  public abstract int insertSysRuleThenConfig(Map<String, Object> paramMap);
  
  public abstract void updateSysRuleThenConfig(Map<String, Object> paramMap);
  
  public abstract void deleteSysRuleThenConfigByPrimaryKey(Map<String, Object> paramMap);
  
  public abstract SysRuleThenConfigDTO findSysRuleThenConfigDTOByCode(String paramString);
}