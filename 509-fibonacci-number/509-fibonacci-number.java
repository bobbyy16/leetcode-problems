			class Solution {
				public int fib(int n) {
					int d1=0;
					int d2=1;
					int sum=0;

					for(int i=0;i<n;i++)
					{
						sum=d1+d2;
						d1=d2;
						d2=sum;

					}
						return d1;

				}

			}