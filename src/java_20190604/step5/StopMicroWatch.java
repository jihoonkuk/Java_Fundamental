package java_20190604.step5;

public class StopMicroWatch extends StopWatch {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		startTime = System.currentTimeMillis();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		endTime = System.currentTimeMillis();
	}

	@Override
	public double getElapsedTime() {
		// TODO Auto-generated method stub
		return (double)(endTime-startTime)/(double)1000000;

	}

}
