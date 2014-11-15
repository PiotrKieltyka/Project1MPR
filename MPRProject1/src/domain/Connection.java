package domain;

public class Connection extends Entity {

	private String modemName;
	private String routerName;
	private String modemId;
	private String routerId;
	private String ipDynamic;
	private String ipStatic;
	private String modemMacAddress;
	private String routerMacAddress;
	
	
	public String getModemName() {
		return modemName;
	}
	public void setModemName(String modemName) {
		this.modemName = modemName;
	}
	public String getRouterName() {
		return routerName;
	}
	public void setRouterName(String routerName) {
		this.routerName = routerName;
	}
	public String getModemId() {
		return modemId;
	}
	public void setModemId(String modemId) {
		this.modemId = modemId;
	}
	public String getRouterId() {
		return routerId;
	}
	public void setRouterId(String routerId) {
		this.routerId = routerId;
	}
	public String getIpDynamic() {
		return ipDynamic;
	}
	public void setIpDynamic(String ipDynamic) {
		this.ipDynamic = ipDynamic;
	}
	public String getIpStatic() {
		return ipStatic;
	}
	public void setIpStatic(String ipStatic) {
		this.ipStatic = ipStatic;
	}
	public String getModemMacAddress() {
		return modemMacAddress;
	}
	public void setModemMacAddress(String modemMacAddress) {
		this.modemMacAddress = modemMacAddress;
	}
	public String getRouterMacAddress() {
		return routerMacAddress;
	}
	public void setRouterMacAddress(String routerMacAddress) {
		this.routerMacAddress = routerMacAddress;
	}
	
}
