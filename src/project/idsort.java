package project;

import java.util.Comparator;

public class idsort implements Comparator<pojo> {
	
	pojo p1;
	pojo p2;
	
	public idsort() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	public idsort(pojo p1, pojo p2) {
		//super();
		this.p1 = p1;
		this.p2 = p2;
	}
	
	@Override
	public int compare(pojo o1, pojo o2) {
		// TODO Auto-generated method stub
		if(o1.getId()>o2.getId())
		return 1;
		else if(o1.getId()==o2.getId())
			return 0;
		else 
			return -1;
	}

}
