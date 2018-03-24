package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryreportstock.dto;

import java.io.Serializable;
import java.util.List;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryacctstock.dto.ExtShCreqryAcctStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.dto.ExtShCreqryGuarStockDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.dto.ExtShCreqryRepayStockDTO;

public class RespQueryQreQueryData implements Serializable {

	private static final long serialVersionUID = -6903984825872065124L;
	
	private ExtShCreqryAcctStockDTO acctInfo ;
	
	private List<ExtShCreqryGuarStockDTO> guarenteeInfo ;
	
	private List<ExtShCreqryRepayStockDTO> repayInfo ;

	public ExtShCreqryAcctStockDTO getAcctInfo() {
		return acctInfo;
	}

	public void setAcctInfo(ExtShCreqryAcctStockDTO acctInfo) {
		this.acctInfo = acctInfo;
	}

	public List<ExtShCreqryGuarStockDTO> getGuarenteeInfo() {
		return guarenteeInfo;
	}

	public void setGuarenteeInfo(List<ExtShCreqryGuarStockDTO> guarenteeInfo) {
		this.guarenteeInfo = guarenteeInfo;
	}

	public List<ExtShCreqryRepayStockDTO> getRepayInfo() {
		return repayInfo;
	}

	public void setRepayInfo(List<ExtShCreqryRepayStockDTO> repayInfo) {
		this.repayInfo = repayInfo;
	}
	
	
	
}	
