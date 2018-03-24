package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneidcards.dto.ExtWlJxlMgPhoneidcardsDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphonenames.dto.ExtWlJxlMgPhonenamesDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneorgs.dto.ExtWlJxlMgPhoneorgsDTO;

import java.util.List;

public class ExtWlJxlUserPhoneSuspicion {
    //用这个手机号码绑定的其他身份证
    private List<ExtWlJxlMgPhoneidcardsDTO> phoneWithOtherIdcards;
    //用这个手机号码绑定的其他姓名
    private List<ExtWlJxlMgPhonenamesDTO> phoneWithOtherNames;
    //电话号码在那些类型的机构中使用过
    private List<ExtWlJxlMgPhoneorgsDTO> phoneAppliedInOrgs;
    public List<ExtWlJxlMgPhoneidcardsDTO> getPhoneWithOtherIdcards() {
        return phoneWithOtherIdcards;
    }
    public void setPhoneWithOtherIdcards(
            List<ExtWlJxlMgPhoneidcardsDTO> phoneWithOtherIdcards) {
        this.phoneWithOtherIdcards = phoneWithOtherIdcards;
    }
    public List<ExtWlJxlMgPhonenamesDTO> getPhoneWithOtherNames() {
        return phoneWithOtherNames;
    }
    public void setPhoneWithOtherNames(
            List<ExtWlJxlMgPhonenamesDTO> phoneWithOtherNames) {
        this.phoneWithOtherNames = phoneWithOtherNames;
    }
    public List<ExtWlJxlMgPhoneorgsDTO> getPhoneAppliedInOrgs() {
        return phoneAppliedInOrgs;
    }
    public void setPhoneAppliedInOrgs(List<ExtWlJxlMgPhoneorgsDTO> phoneAppliedInOrgs) {
        this.phoneAppliedInOrgs = phoneAppliedInOrgs;
    }

}
