package com.project.rms.request;

public interface RequestState {
	void execute(Request r, ReqMgmtFacade rf);

	boolean addtoQueue(Request r, ReqMgmtFacade rf);
	boolean processRequest(Request r, ReqMgmtFacade rf);
	boolean retrieveFromQueue(Request r, ReqMgmtFacade rf);

	boolean validateRequest(Request r);
	
	
}
