package Ex1;

import java.rmi.*;

public class CalculatorImpl implements Calculator{

	@Override
	public int Add(int a, int b) throws RemoteException {
		return a+b;
	}

	@Override
	public int Sub(int a, int b) throws RemoteException {
		return a+b;
	}

	@Override
	public int Multi(int a, int b) throws RemoteException {
		return a*b;
	}

	@Override
	public float Div(int a, int b) throws RemoteException {
		return a/b;
	}

}
