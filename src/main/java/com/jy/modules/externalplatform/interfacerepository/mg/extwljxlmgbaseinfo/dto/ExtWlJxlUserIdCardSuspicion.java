package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardnames.dto.ExtWlJxlMgIdcardnamesDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardorgs.dto.ExtWlJxlMgIdcardorgsDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.dto.ExtWlJxlMgIdcardphonesDTO;

import java.util.List;

public class ExtWlJxlUserIdCardSuspicion  {

    //用这个身份证号码绑定的其他姓名
    private List<ExtWlJxlMgIdcardnamesDTO> idcardWithOtherNames;
    //用这个身份证绑定的其他手机号码
    private List<ExtWlJxlMgIdcardphonesDTO> idcardWithOtherPhones;
    //身份证在那些类型的机构中使用过
    private List<ExtWlJxlMgIdcardorgsDTO>  idcardAppliedInOrgs;
    public List<ExtWlJxlMgIdcardnamesDTO> getIdcardWithOtherNames() {
        return idcardWithOtherNames;
    }
    public void setIdcardWithOtherNames(
            List<ExtWlJxlMgIdcardnamesDTO> idcardWithOtherNames) {
        this.idcardWithOtherNames = idcardWithOtherNames;
    }
    public List<ExtWlJxlMgIdcardphonesDTO> getIdcardWithOtherPhones() {
        return idcardWithOtherPhones;
    }
    public void setIdcardWithOtherPhones(
            List<ExtWlJxlMgIdcardphonesDTO> idcardWithOtherPhones) {
        this.idcardWithOtherPhones = idcardWithOtherPhones;
    }
    public List<ExtWlJxlMgIdcardorgsDTO> getIdcardAppliedInOrgs() {
        return idcardAppliedInOrgs;
    }
    public void setIdcardAppliedInOrgs(
            List<ExtWlJxlMgIdcardorgsDTO> idcardAppliedInOrgs) {
        this.idcardAppliedInOrgs = idcardAppliedInOrgs;
    }
}
