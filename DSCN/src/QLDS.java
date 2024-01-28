import java.util.ArrayList;
import java.util.List;

public class QLDS implements IQLDS{
	List<CaNhan> list;

	public QLDS() {//constructor
		list = new ArrayList<>();
	}
	@Override
	public int them(CaNhan cn) {
		// TODO Auto-generated method stub
		list.add(cn);
		return 0;
	}

	@Override
	public int xoa(CaNhan cn) {
		// TODO Auto-generated method stub
		list.remove(cn);
		return 0;
	}

	@Override
	public void inDS() {
		// TODO Auto-generated method stub
		for(CaNhan cn:list) {
			cn.hienThiTT();
			System.out.println(cn.hienThiTT());
		}
	}
	
	
}
