#include <stdio.h>
#include<math.h>

//function to do the addition
float add(){
    int num1, num2;
    printf("\n\nEnter the first number: ");
    scanf("%d", &num1);
    
    printf("\nenter the second number: ");
    scanf("%d", &num2);

    return num1 + num2;
}

//function to do the substraction
float sub(){
    int num1, num2;
    printf("\n\nEnter the first number: ");
    scanf("%d", &num1);
    
    printf("\nenter the second number: ");
    scanf("%d", &num2);

    return num1- num2;
}

//function to do the multiplication
int multi(){
    int num1, num2;
    printf("\n\nEnter the first number: ");
    scanf("%d", &num1);
    
    printf("\nenter the second number: ");
    scanf("%d", &num2);

    return num1 * num2;
}
//function to do the division
int devide(){
    int num1, num2;
    printf("\n\nEnter the first number: ");
    scanf("%d", &num1);
    
    printf("\nenter the second number: ");
    scanf("%d", &num2);

    return num1/ num2;
}

//function to calculate the square root
double calculateSquareRoot() {
    double number;
    printf("Enter a number to find the square root: ");
    scanf("%lf", &number);
    return sqrt(number);
}

//function to calculate the sine of an angle
double calculateSine() {
    double angle;
    printf("Enter the angle to find the Sin of the angle: ");
    scanf("%lf", &angle);
    return sin(angle);
}

//function to calculate the cosine of an angle
double calculateCosine() {
    double angle2;
    printf("Enter the angle to find the Sin of the angle: ");
    scanf("%lf", &angle2);
    return cos(angle2);
}

//function to calculate the power of the base
double calculatePower() {
    double base, exponent;
    printf("\n\nEnter the Base: ");
    scanf("%lf", &base);
    
    printf("\nenter the exponent: ");
    scanf("%lf", &exponent);
    return pow(base, exponent);
}


int main()
{
    char op;
    int result;
    double result1;
    
    printf("\t \t *************************************************");
    printf("\n \t \t \t \t Welcome to Math Calculator");
    printf("\n \t \t **************************************************");
    
    char name[20];
    printf("\n please Enter your name ");
    fgets(name, 20, stdin);
    printf("\n Helllo %s ,Welcome to Math Calculator.", name);
    
    printf("Instructions:\n chose '+' For addition \n chose '-' for substraction \n chose '*' for multiplying \n chose '/' for division \n chose 'r' to fine the square root \n chose 's' to find the sine of the angle \n chose 'c' to fine the cos of the angle \n chose 'p' to find the power of the base\n ");

    printf("please enter the operator + - * / r s c p\n ");
    scanf(" %c", &op);


    
    switch (op){
        case '+':
            result = add();
            printf("Result: %d", result);
            break;
        case '-':
            result = sub();
            printf("Result: %d", result);
            break;
        case '*':
            result = multi();
            printf("%d", result);
            break;
        case '/':
            result = devide();
            printf("Result: %d", result);
            break;
        case 'r':  // for square root
            result1 = calculateSquareRoot();
            printf("Result: %lf", result1);
            break;
        case 's':  // for sine
            result1 = calculateSine();
            printf("Result: %lf", result1);
            break;
        case 'c':  // for cosine
            result1 = calculateCosine();
            printf("Result: %lf", result1);
            break;
        case 'p':  // for power
            result1 = calculatePower();
            printf("Result: %lf", result1);
            break;
        default:
            printf("invalid operator");
            break;
        }

}


