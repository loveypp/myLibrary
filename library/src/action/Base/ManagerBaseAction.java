package action.Base;

import com.opensymphony.xwork2.ActionSupport;

import service.ManagerService;
import service.ReaderService;

public class ManagerBaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	protected ReaderService rs;
	protected ManagerService ms;

	// 依赖注入需要的setter的方法
	public void setms(ManagerService ms) {
		this.ms = ms;
	}

	public void setRs(ReaderService rs) {
		this.rs = rs;
	}

}
