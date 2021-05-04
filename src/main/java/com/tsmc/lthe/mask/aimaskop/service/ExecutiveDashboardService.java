package com.tsmc.lthe.mask.aimaskop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tsmc.lthe.mask.aimaskop.model.ChartVo;
import com.tsmc.lthe.mask.aimaskop.model.PrpData;

@Component
public class ExecutiveDashboardService {

	
	
	private static List<PrpData> list=new ArrayList<>();

	public ChartVo getPrpWeeklyTrend(){
		ChartVo v=new ChartVo();
		List<String> x=new ArrayList<>();
		List<List<String>> y=new ArrayList<>();
		List<String> y1=new ArrayList<>();//Wafer move
		List<String> y2=new ArrayList<>();//Prp
		
		v.setX(createWeek());
		
		y.add(y1);
		y.add(y2);
		y1.add("848");
		y1.add("851");
		y1.add("932");
		y1.add("1039");
		y1.add("1080");
		y1.add("932");
		y1.add("1160");
		y1.add("977");
		y1.add("1315");
		y1.add("1221");
		y1.add("1099");
		y1.add("1320");
		
		
		y2.add("3.9");
		y2.add("4.1");
		y2.add("3.6");
		y2.add("3.9");
		y2.add("5.1");
		y2.add("4.6");
		y2.add("4.9");
		y2.add("4.8");
		y2.add("5.5");
		y2.add("5.9");
		y2.add("5.7");
		y2.add("6.2");
		v.setTitle("PRP 2021Q2");
		v.setTitle("Overall");
		v.setY(y);
		
		
		return v;
	}

	public List<PrpData> queryKPIByWeek(){
		
		List<PrpData> rtn=new ArrayList<>();
		
		
		
		rtn.add(getOverall());
		rtn.add(getAPE301());
		rtn.add(getAPE302());
		rtn.add(getAPE303());
		rtn.add(getAPE304());
		return rtn;
		
	}
	
	private PrpData getAPE301() {
		PrpData prpData=new PrpData();
	
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		prpData.setPrp(prp);
		prpData.setTitle("PRP");
		prpData.setSubTitle("2021Q1 APE301");
		prpData.setWaferMove(waferMove);
		prpData.setWeekNo(createWeek());
		
		prp.add("0.3");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0.2");
		prp.add("0.2");
		prp.add("1.3");
		prp.add("1.2");
		prp.add("0.9");
		prp.add("0.5");
		prp.add("1.3");
		
		waferMove.add("36");
		waferMove.add("41");
		waferMove.add("60");
		waferMove.add("41");
		waferMove.add("86");
		waferMove.add("89");
		waferMove.add("75");
		waferMove.add("61");
		waferMove.add("79");
		waferMove.add("99");
		waferMove.add("96");
		waferMove.add("119");
		
		
		
		return prpData;
	}
	private PrpData getAPE302() {
		PrpData prpData=new PrpData();
	
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		prpData.setPrp(prp);
		prpData.setTitle("PRP");
		prpData.setSubTitle("2021Q1 APE302");
		prpData.setWaferMove(waferMove);
		prpData.setWeekNo(createWeek());
		prp.add("3.5");
		prp.add("0.6");
		prp.add("1.4");
		prp.add("2.1");
		prp.add("1.6");
		prp.add("0.9");
		prp.add("1.3");
		prp.add("0.6");
		prp.add("0.9");
		prp.add("0.4");
		prp.add("0.3");
		prp.add("0.9");
		
		waferMove.add("39");
		waferMove.add("61");
		waferMove.add("20");
		waferMove.add("41");
		waferMove.add("86");
		waferMove.add("65");
		waferMove.add("125");
		waferMove.add("61");
		waferMove.add("69");
		waferMove.add("99");
		waferMove.add("11");
		waferMove.add("139");
		
		
		
		return prpData;
	}
	private PrpData getAPE303() {
		PrpData prpData=new PrpData();
	
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		prpData.setPrp(prp);
		prpData.setTitle("PRP");
		prpData.setSubTitle("2021Q1 APE303");
		prpData.setWaferMove(waferMove);
		prpData.setWeekNo(createWeek());
		prp.add("0.3");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0.2");
		prp.add("0.2");
		prp.add("1.3");
		prp.add("1.2");
		prp.add("0.9");
		prp.add("0.5");
		prp.add("1.3");
		
		waferMove.add("36");
		waferMove.add("41");
		waferMove.add("60");
		waferMove.add("41");
		waferMove.add("86");
		waferMove.add("89");
		waferMove.add("75");
		waferMove.add("61");
		waferMove.add("79");
		waferMove.add("99");
		waferMove.add("96");
		waferMove.add("119");
		
		
		
		return prpData;
	}
	private PrpData getAPE304() {
		PrpData prpData=new PrpData();
	
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		prpData.setPrp(prp);
		prpData.setTitle("PRP");
		prpData.setSubTitle("2021Q1 APE304");
		prpData.setWaferMove(waferMove);
		prpData.setWeekNo(createWeek());
		prp.add("0.3");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0");
		prp.add("0.2");
		prp.add("0.2");
		prp.add("1.3");
		prp.add("1.2");
		prp.add("0.9");
		prp.add("0.5");
		prp.add("1.3");
		
		waferMove.add("36");
		waferMove.add("41");
		waferMove.add("60");
		waferMove.add("41");
		waferMove.add("86");
		waferMove.add("89");
		waferMove.add("75");
		waferMove.add("61");
		waferMove.add("79");
		waferMove.add("99");
		waferMove.add("96");
		waferMove.add("119");
		
		
		
		return prpData;
	}
	
	private PrpData getOverall(){
		
		PrpData prpOverall=new PrpData();
		List<String> prp=new ArrayList<>();
		List<String> waferMove=new ArrayList<>();
		List<String> weekNo=new ArrayList<>();
		prpOverall.setPrp(prp);
		prpOverall.setTitle("PRP");
		prpOverall.setSubTitle("2021Q1 Overall");
		
		prp.add("4.1");
		prp.add("3.9");
		prp.add("4.9");
		prp.add("6.1");
		prp.add("5.2");
		prp.add("4.3");
		prp.add("4.1");
		prp.add("4.8");
		prp.add("4.3");
		prp.add("4.4");
		prp.add("5.3");
		prp.add("4.6");
		
		waferMove.add("321");
		waferMove.add("251");
		waferMove.add("321");
		waferMove.add("471");
		waferMove.add("556");
		waferMove.add("589");
		waferMove.add("534");
		waferMove.add("410");
		waferMove.add("514");
		waferMove.add("475");
		waferMove.add("601");
		waferMove.add("569");
	
		
		prpOverall.setWaferMove(waferMove);
		prpOverall.setWeekNo(createWeek());
		return prpOverall;
		
	}
	
	private List<String> createWeek() {
		List<String> weekNo=new ArrayList<>();
		weekNo.add("W101");
		weekNo.add("W102");
		weekNo.add("W103");
		weekNo.add("W104");
		weekNo.add("W105");
		weekNo.add("W106");
		weekNo.add("W107");
		weekNo.add("W108");
		weekNo.add("W109");
		weekNo.add("W110");
		weekNo.add("W111");
		weekNo.add("W112");
		return weekNo;
	}
	
	
	
}
 