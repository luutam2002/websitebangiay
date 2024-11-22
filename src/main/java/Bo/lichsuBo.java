package Bo;

import java.util.ArrayList;

import Bean.lichsuBean;
import Dao.lichsuDao;

public class lichsuBo {
	public ArrayList<lichsuBean> dslichsu = new ArrayList<lichsuBean>();
	lichsuDao lsdao = new lichsuDao();

	public ArrayList<lichsuBean> getLichSu(long ma, int check) throws Exception {
		dslichsu = lsdao.getLichSu(ma, check);
		return dslichsu;
	}
}
