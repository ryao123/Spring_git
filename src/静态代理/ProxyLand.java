package ��̬����;
/**
 * ���������
 * @author Effort
 * 2020��4��14������3:12:52
 */
public class ProxyLand {

	//�����Ŷ���
	private Landlady land;//������
	
	public void tenement() {
		//�ȿ��Ƿ��з�Դ��Ϣ
		if(land == null) {
			land= new Landlady();
		}
		Intermediary.before();
		land.tenement();
		Intermediary.after();
	}
	
	
}
