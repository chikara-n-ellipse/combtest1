package combtest1;
import java.util.ArrayList;
import java.util.List;

class Permutation1 {
	List<ArrayList<Integer>> perms = new ArrayList<ArrayList<Integer>>();
	int n = 0;
	
	public List<ArrayList<Integer>> getPerms(ArrayList<Integer> data){
		ArrayList<Integer> cand = data;
		ArrayList<Integer> perm = new ArrayList<Integer>();
		treeMake(cand, perm);
		return perms;
	}
	
	private void treeMake(ArrayList<Integer> candI, ArrayList<Integer> permI){
		
		n += 1;

		
		if(candI.size()==0) {
			perms.add(permI);
		}
		
		for(int i = 0; i < candI.size(); i++) {
			
			ArrayList<Integer> cand = new ArrayList<Integer>(candI);
			ArrayList<Integer> perm = new ArrayList<Integer>(permI);
			
			perm.add(cand.get(i));
			cand.remove(i);
			treeMake(cand, perm);
		}
		n -= 1;
	}
	
}
