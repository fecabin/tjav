/**
 * 
 */
package com.tsmc.lthe.mask.aimaskop.model;

import java.util.List;

/**
 * @author fecabin
 *
 */
public class PrpDashboardVo {

	List<PrpInsp> inspData;
	
	List<PrpData> prpData;
	
	List<PrpData> chartData;

	public List<PrpInsp> getInspData() {
		return inspData;
	}

	public void setInspData(List<PrpInsp> inspData) {
		this.inspData = inspData;
	}

	public List<PrpData> getPrpData() {
		return prpData;
	}

	public void setPrpData(List<PrpData> prpData) {
		this.prpData = prpData;
	}

	public List<PrpData> getChartData() {
		return chartData;
	}

	public void setChartData(List<PrpData> chartData) {
		this.chartData = chartData;
	}


}

