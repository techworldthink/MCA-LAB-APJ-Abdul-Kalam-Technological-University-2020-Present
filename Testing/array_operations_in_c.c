#include <stdio.h>
#include <stdlib.h>

int main() {
	int array[100],i;
	int array_count=0;
	int opt=0;
	while (1){
		printf("\n\n ...................\n");
		printf("1) INSERT\n");
		printf("2) DELETE\n");
		printf("3) VIEW");
		printf("0) QUIET\n");
		printf("choose your option : ");
		scanf("%d",&opt);
		if (opt==0)
			exit(0);
		switch(opt){
			case 1:
				printf("1");
				break;
			defualt:
				printf("d");
		}
	}
	
	printf("ok");
	return 0;
}
