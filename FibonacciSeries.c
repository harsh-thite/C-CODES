#include <stdio.h>

int main()
{
  int first = 0, second = 1, third, n, i;

  printf("Enter the number of terms of Series : ");
  scanf("%d", &n);

  printf("%d %d", first, second);

  for (i = 3; i <= n; i++)
  {
    third = first + second;
    printf(" %d", third);
    first = second;
    second = third;
  }

  return 0;
}