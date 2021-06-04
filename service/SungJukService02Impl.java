package yh.spring.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yh.spring.dao.SungJukDAO;
import yh.spring.vo.SungJuk;

@Service("sjsrv02")
public class SungJukService02Impl implements SungJukService {

	@Autowired
	private SungJukDAO sjdao02;
	

	@Override
	public void newSungJuk() {
		SungJuk sj = new SungJuk("혜교",99,84,97);
		computeSungJuk(sj);
		System.out.println("성적데이터 생성 완료!!");
		
		sjdao02.insertSungjuk(sj);

	}

	
	private void computeSungJuk(SungJuk sj) {
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avg = tot / 3.0; 
		String grd = "가";
		
		if (avg >= 90) grd = "수";
		else if (avg >= 80) grd = "우";
		else if (avg >= 70) grd = "미";
		else if (avg >= 60) grd = "양";
		
		sj.setTot(tot);
		sj.setAvg(avg);
		sj.setGrd(grd.charAt(0));
	}


	@Override
	public void readAllSungJuk() {
		StringBuffer sb = new StringBuffer();
		List<SungJuk> sjs = sjdao02.selectAllSungJuk();
		
		for (SungJuk sj: sjs) sb.append(sj);
		System.out.println(sb);
		
	}


	@Override
	public void readOneSungJuk(int sjno) {
		SungJuk sj = sjdao02.selectOneSungJuk(sjno);
		System.out.println(sj);	
	}


	@Override
	public void modifySungJuk() {
		SungJuk sj = new SungJuk(null,98,90,65);
		sj.setSjno("8");
		computeSungJuk(sj);
				
		sjdao02.updateSungJuk(sj);
		
	}


	@Override
	public void removeSungJuk() {
		sjdao02.deleteSungJuk(7);
		
	}

}