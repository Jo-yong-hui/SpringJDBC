package yh.spring.dao;


import java.util.List;

import yh.spring.vo.SungJuk;

public interface SungJukDAO {
	void insertSungjuk(SungJuk sj);
	List<SungJuk> selectAllSungJuk();
	SungJuk selectOneSungJuk(int sjno);
	void updateSungJuk(SungJuk sj);
	void deleteSungJuk(int i);

}
