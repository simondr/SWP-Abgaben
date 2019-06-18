#include <iostream>

int main() {


    for (int i = 0; i <= 100; i++){

        if(i%3 == 0 && i%4 == 0){
            printf("fizzbuzz");
        }
        else if(i%4 == 0){
            printf("buzz");
        }
        else if(i%3 == 0){
            printf("fizz");
        }
        else{
            printf("%d",i);
        }

        printf("\n");
    }

    return 0;
}