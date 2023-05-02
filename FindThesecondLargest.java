#include <stdio.h>
#include<limits.h>
int main() {
	int a[100],n;
	//printf("Enter thr number of the elements\n");
	scanf("%d",&n);
	int first=INT_MIN,second=INT_MIN,third=INT_MIN;
	for(int i=0;i<n;i++){
	    scanf("%d",&a[i]);
	    if(a[i]>first){
	        third=second;
	        second=first;
	        first=a[i];
	    }
	    else if(a[i]>second && first!=a[i] ){
	        third=second;
	        second=a[i];
	    }
	    else if(a[i]>third  && second!=a[i]){
	        third=a[i];
	    }
	}
	printf(" first element:%d , second element :%d and the third element is %d",first,second,third);
	return 0;
}
