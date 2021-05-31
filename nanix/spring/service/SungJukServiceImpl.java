package nanix.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nanix.spring.dao.SungJukDAO;
import nanix.spring.vo.SungJuk;

@Service("sjsrv")
public class SungJukServiceImpl implements SungJukService {

	@Autowired
	private SungJukDAO sjdao;
	

	@Override
	public void newSungJuk() {
		SungJuk sj = new SungJuk("미겔",0,90,0);
		computeSungJuk(sj);
		System.out.println("성적데이터 생성 완료!");
		
		sjdao.insertSungJuk(sj);
		
	} // 성적데이터를 입력?
	
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
	} // 성적 계산?

	
	
}