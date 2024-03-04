package baitapCC2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import baitapJ4.ChuyenXe;

public class QLSV{
	List<SinhVien> list = new ArrayList<>();
	
	ISoSanh soSanh;//biến đại diện phải có setter
	
	public QLSV setSoSanh(ISoSanh soSanh) {
		this.soSanh = soSanh;
		return this;
	}
	//cách 3
	Comparator<SinhVien> comparator;
	public void sapXep3() {
		list.sort(comparator);
	}
	//thủ công
	 public void sapXep() {
		 for(int i=0; i<list.size()-1;i++)
			 for(int j=i+1;j<list.size();j++)
				 if(soSanh.soSanh(list.get(i), list.get(j))>0) {
					 SinhVien s = list.get(i);
		 			 list.set(i, list.get(j));
		 			 list.set(j, s);
				 }
	 }
	 //tự động
	 public void sapXep2() {
		 list.sort((o1,o2)->soSanh.soSanh(o1, o2));
	 }
	 
	public void inDS() {
		for (SinhVien c: list) {
			System.out.println(c.toString());
		}
	}

}
