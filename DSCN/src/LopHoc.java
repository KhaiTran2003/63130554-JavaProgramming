
public class LopHoc {
	QLDS qlds;
	
	public LopHoc() {
		qlds = new QLDS();
	}
	
	int themHS(HocSinh hs) {
		CaNhan cn1 = hs;
		qlds.them(cn1);
		return 1;
	}
	int themGV(GiaoVien gv) {
		CaNhan cn2 = gv;
		qlds.them(cn2);
		return 1;
	}
	void inDSHS() {
		for(CaNhan cn:qlds.list) {
			if(cn.who().equals("hs")) {
				System.out.println(cn.hienThiTT());
			}
		}
	}
	void inDSGV() {
		for(CaNhan cn:qlds.list) {
			if(cn.who().equals("gv")) {
				System.out.println(cn.hienThiTT());
			}
		}
	}
}
