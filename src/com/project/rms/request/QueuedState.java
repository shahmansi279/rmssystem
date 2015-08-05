package com.project.rms.request;

public class QueuedState implements RequestState {

	@Override

	public void execute(Request r, ReqMgmtFacade rf)

	{

		boolean isReqReadyforAllocation;
		// TODO Auto-generated method stub

		System.out.println(" Request State -- Queued State\n");

		// get the flag
		// check if() request needs can be allocated or not time check
		isReqReadyforAllocation = manageQueue(r, rf);

		if (isReqReadyforAllocation) {
			
			
			r.setrState(new AllocatingState());
			r.executeAction(rf);
			
		} else {

			System.out.println(
					"Request has been queued . A message will be sent with driver and taxi details two hours before the pick up time");
		}
	}

	public boolean manageQueue(Request r, ReqMgmtFacade rf) {

		return rf.manageQueueRequest(r);

		// TODO Auto-generated method stub

	}

	@Override
	public boolean validateRequest(Request r) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addtoQueue(Request r, ReqMgmtFacade rf) {
		return false;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean processRequest(Request r, ReqMgmtFacade rf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retrieveFromQueue(Request r, ReqMgmtFacade rf) {
		
	return false;
		
		// TODO Auto-generated method stub

	}

}
