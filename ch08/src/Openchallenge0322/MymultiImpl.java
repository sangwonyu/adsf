package Openchallenge0322;

import java.util.Arrays;

public class MymultiImpl implements MyMulti {

	@Override
	public int max(int[] args) {
		Arrays.sort(args);
		
		return args[0];
	}

	@Override
	public int min(int[] args) {
		for(int i=0;i<args.length;i++) {
			if(args[i]>args[i+1]) {
				int tmp = args[i+1];
				args[i+1]=args[i];
				args[i] =tmp;
			}
		}
		return args[0];
	}

	@Override
	public int sum(int[] args) {
		int sum=0;
		for(int  i=0;i<args.length;i++) {
			sum+=args[i];
		}
		return sum;
	}

	@Override
	public double avg(int[] args) {
		double avg=0;
		int sum=0;
		for(int  i=0;i<args.length;i++) {
			sum+=args[i];
		}
		avg=sum/args.length;
		return 0;
	}
	
}
