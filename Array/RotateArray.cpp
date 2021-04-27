#include<bits/stdc++.h>
using namespace std;
int main()
{
    int T;
    cin >> T;
    while(T--)
    {
        int N, D;
        cin >> N >> D;
        vector<int> arr;
        for(int i = 0; i < N; i++)
        {
            int x;
            cin >> x;
            
            arr.push_back(x);
        }
        rotate(arr.begin(), arr.begin() + D, arr.end());
        
        for(int i = 0; i < N; i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
	return 0;
}