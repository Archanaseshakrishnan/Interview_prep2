package CTC;

public class String2reversing_a_string_in_c {
	#include <iostream>
	#include <string.h>
	using namespace std;

	void reverse(char* stri){
	    int len = strlen(stri);
	    char* word=(char*)malloc(strlen(stri));
	    for(int i=0;i<len;i++){
	        word[i]=stri[len-i-1];
	    }
	    printf("%s",word);
	}

	int main() {
		// your code goes here
		reverse("welcome");
		return 0;
	}
}
