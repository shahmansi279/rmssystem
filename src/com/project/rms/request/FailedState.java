package com.project.rms.request;

public class FailedState implements RequestState {

	@Override
	public void execute(Request r, ReqMgmtFacade rf) {
		
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public boolean addtoQueue(Request r, ReqMgmtFacade rf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean processRequest(Request r, ReqMgmtFacade rf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retrieveFromQueue(Request r, ReqMgmtFacade rf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateRequest(Request r) {
		// TODO Auto-generated method stub
		return false;
	}

}
