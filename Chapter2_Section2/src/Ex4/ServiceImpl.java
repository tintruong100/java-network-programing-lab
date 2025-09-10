package Ex4;

import java.rmi.*;
import java.util.*;
import java.util.stream.Collectors;

public class ServiceImpl implements Service{

	@Override
	public List<String> Duplicate(String s) throws RemoteException {
		List<String> wordsList = Arrays.stream(s.split(" ")).collect(Collectors.toList());

		Set<String> tempSet = new HashSet<>();

		List<String> duplicateWords = wordsList.stream()
		    .filter(w -> !tempSet.add(w))
		    .collect(Collectors.toList());

		return duplicateWords;
	}


}
