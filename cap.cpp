 #include<iostream>
using namespace std;
int main(void)
{
	char name[20];
	int i;
	cout<<"input your name = \t";
	cin>>name[i];
	for(i=0; name[i]!='\0'; i++)
	{
		if(name[i]>=97 && name[i]<=122)
		{
			name[i]= name[i] -32;

		}
		cout<<name[i];
	}
}