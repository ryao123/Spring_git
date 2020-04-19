package 静态代理;
/**
 * 代理包租婆
 * @author Effort
 * 2020年4月14日下午3:12:52
 */
public class ProxyLand {

	//包租婆对象
	private Landlady land;//包租婆
	
	public void tenement() {
		//先看是否有房源信息
		if(land == null) {
			land= new Landlady();
		}
		Intermediary.before();
		land.tenement();
		Intermediary.after();
	}
	
	
}
