package computer;

public class computer {
	private Cpu cpu;
	private NeiCun neicun;
	private YingPan yingpan;
	public Cpu getCpu() {
		return cpu;
	}
	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}
	public NeiCun getNeicun() {
		return neicun;
	}
	public void setNeicun(NeiCun neicun) {
		this.neicun = neicun;
	}
	public YingPan getYingpan() {
		return yingpan;
	}
	public void setYingpan(YingPan yingpan) {
		this.yingpan = yingpan;
	}
	
	public void print() {
		System.out.println(cpu.getCpu()+"和"+neicun.getNeiCun()+"和"+yingpan.getYingPan()+"组装电脑");
	}
}
