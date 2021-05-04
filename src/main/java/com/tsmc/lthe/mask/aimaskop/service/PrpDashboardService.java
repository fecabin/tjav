/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsmc.lthe.mask.aimaskop.entity.CaseSummary;
import com.tsmc.lthe.mask.aimaskop.model.CaseDefect;
import com.tsmc.lthe.mask.aimaskop.model.CaseDetail;
import com.tsmc.lthe.mask.aimaskop.model.CaseMain;
import com.tsmc.lthe.mask.aimaskop.model.CaseProcess;
import com.tsmc.lthe.mask.aimaskop.model.CaseSummaryVo;
import com.tsmc.lthe.mask.aimaskop.model.PrpDashboardVo;
import com.tsmc.lthe.mask.aimaskop.model.PrpInsp;
import com.tsmc.lthe.mask.aimaskop.repository.CaseSummaryRepository;

/**
 * @author fecabin
 *
 */
@Service
public class PrpDashboardService {

	
	public PrpDashboardVo getPrpDashboardByCond(String from,String to){
		PrpDashboardVo rnt=new PrpDashboardVo();
		List<PrpInsp> inspData=new ArrayList<>();
		rnt.setInspData(inspData);
		
		PrpInsp insp=new PrpInsp();
		inspData.add(insp);
		insp.setDefect1CCnt(0);
		insp.setDefect2CCnt(1);
		insp.setElementPredict("Sn");
		insp.setInspDt("04/02 13:33");
		insp.setLastInspDt("04/01 16:50");
		insp.setInspTool("APM304");
		insp.setInspTool("APM304");
		
		return rnt;
	}
	
	
	private List<CaseMain> getCaseMain() {
		
		List<CaseMain> rtn=new ArrayList<>();
		CaseMain c1=new CaseMain();
		rtn.add(c1);
		c1.setCaseDate("2021/04/03 16:14:12");
		c1.setCaseMask("TMIG18-960A-5");
		CaseDetail caseDetail=new CaseDetail();
		
		 List<CaseProcess> process=new ArrayList<>();
		 List<CaseDefect> defects=new ArrayList<>();
		 CaseProcess p1=new CaseProcess();
		 p1.setProcDt("03/04 11:49");
		 p1.setProcName("ADC");
		 p1.setProcStatus("Success");
		 CaseProcess p2=new CaseProcess();
		 p2.setProcDt("03/04 12:00");
		 p2.setProcName("MDC");
		 p2.setProcStatus("Success");
		 process.add(p1);
		 process.add(p2);
		 
		 
		 
		 CaseDefect d1=new CaseDefect();
		 d1.setDefectCd("1C");
		 d1.setDefectId("1");
		 d1.setDefectSize("54");
		 d1.setElementActual("Sn");
		 d1.setElementPredict("Sn");
		 d1.setIsPrpDefect("Y");
		 d1.setLocX("6541.10");
		 d1.setLocY("9006.29");
		 d1.setImgX8UDftT("../assets/d2.png");
		 d1.setImgX8UDftR("../assets/d2.png");
		 d1.setImgX8URefT("../assets/d2.png");
		 d1.setImgX8URefR("../assets/d2.png");
		 d1.setElePredict("../assets/d2.png");
		 
		 
		 CaseDefect d2=new CaseDefect();
		 d2.setDefectCd("1C");
		 d2.setDefectId("2");
		 d2.setDefectSize("53");
		 d2.setElementActual("");
		 d2.setElementPredict("BN");
		 d2.setIsPrpDefect("N");
		 d2.setLocX("3221.10");
		 d2.setLocY("12355.44");
		 d2.setImgX8UDftT("../assets/d2.png");
		 d2.setImgX8UDftR("../assets/d2.png");
		 d2.setImgX8URefT("../assets/d2.png");
		 d2.setImgX8URefR("../assets/d2.png");
		 d2.setElePredict("../assets/d2.png");
		 
		 defects.add(d1);
		 defects.add(d2);
		caseDetail.setDefects(defects);
		caseDetail.setProcess(process);
		c1.setCaseDetail(caseDetail);
		
		return rtn;
		
	}
	
	public List<CaseSummaryVo> getAllCaseSummaries(){
		List<CaseSummaryVo> rtn=new ArrayList<>();
		CaseSummaryVo caseNew=new CaseSummaryVo();
		CaseSummaryVo caseProc=new CaseSummaryVo();
		CaseSummaryVo caseClosed=new CaseSummaryVo();
		caseNew.setProcStatus("New");
		
		caseNew.setCriticalDftCnt(2);
		caseNew.setOnoDftCnt(2);
		caseNew.setPellicleDftCnt(1);
		
		caseNew.setWiaNtoCnt(3);
		caseNew.setWiaRrCnt(2);
		caseNew.setWiaRequalCnt(4);
		
		caseNew.setRbiCenterCnt(0);
		caseNew.setRbiEdgeCnt(2);
		caseProc.setRbiBx100Cnt(2);
		
		caseNew.setMaskOutOfCnt(0);
		caseNew.setPellicleRuptureCnt(0);
		
		caseProc.setProcStatus("Processing");
		caseProc.setCriticalDftCnt(3); 
		caseProc.setCriticalDftCnt(2);
		caseProc.setOnoDftCnt(2);
		caseProc.setPellicleDftCnt(1);
		
		caseProc.setWiaNtoCnt(3);
		caseProc.setWiaRrCnt(2);
		caseProc.setWiaRequalCnt(4);
		
		caseProc.setRbiCenterCnt(0);
		caseProc.setRbiEdgeCnt(2);
		caseProc.setRbiBx100Cnt(4);
		
		caseProc.setMaskOutOfCnt(0);
		caseProc.setPellicleRuptureCnt(0);
		
		
		
		caseClosed.setProcStatus("Closed");
		caseClosed.setCriticalDftCnt(5);
		
		caseClosed.setCriticalDftCnt(3);
		caseClosed.setCriticalDftCnt(2);
		caseClosed.setOnoDftCnt(2);
		caseClosed.setPellicleDftCnt(1);
		
		caseClosed.setWiaNtoCnt(3);
		caseClosed.setWiaRrCnt(2);
		caseClosed.setWiaRequalCnt(4);
		
		caseClosed.setRbiCenterCnt(0);
		caseClosed.setRbiEdgeCnt(3);
		caseClosed.setRbiBx100Cnt(3);
		
		caseClosed.setMaskOutOfCnt(1);
		caseClosed.setPellicleRuptureCnt(0);
		
		
		rtn.add(caseNew);
		rtn.add(caseProc);
		rtn.add(caseClosed);
		return rtn;
	}
	
}

