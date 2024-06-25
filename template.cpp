//transform(su.begin(), su.end(), su.begin(), ::toupper);
//int mybit_int;
//mybit_int = (int)(bt.to_ulong());
#include <bits/stdc++.h>
#define ll long long
#define sh_fio ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0)
#define gcd(a,b) (__gcd((a),(b)))
#define lcm(a,b) (((a)*(b))/gcd((a),(b)))
#define bc __builtin_popcountll
#define bc0 __builtin__ctzll
#define pb push_back
#define fi first
#define se second
#define mod2 998244353
#define lld long double
#define cntI(x) (int)((x).size())
#define ps(x,y) fixed<<setprecision(y)<<x
#define mxv(v) *max_element(v.begin(),v.end())
using namespace std;
const double PI = 3.141592653589793238463;
const ll int MOD = 1000000007;
inline long long fp(long long bs, long long pw) {
    long long res = 1;
    while(pw > 0) {

        if(pw % 2 == 1) {
            res = (res*bs) % MOD;
        }
        bs = (bs * bs) % MOD;
        pw = pw / 2;
    }
    return res;
}
ll pp(ll bs, unsigned ll pw)
{
    ll ans = 1;

    while (pw > 0)
    {

        if (pw & 1)
            ans = ans*bs;


        pw = pw>>1;
        bs = bs*bs;
    }
    return ans;
}

bool isFloatAnInteger(float f)
{
    if(floor(f)==ceil(f))
        return true;
    else
        return false;
}
bool isPrime(ll n)
{

    if (n <= 1)
        return false;
    if (n <= 3)
        return true;

    if (n % 2 == 0 || n % 3 == 0)
        return false;

    for (ll i = 5; i * i <= n; i = i + 6)
        if (n % i == 0 || n % (i + 2) == 0)
            return false;

    return true;
}

ll mxx(ll a, ll b)
{
    if(a>b)
        return a;
    return b;
}

ll mnn(ll a, ll b)
{
    if(a<b)
        return a;
    return b;
}

void fu(ll n, vector<ll> &arr)
{
    if(n&1)
    {
        cout<<"4"<<endl;
        cout<<"1 "<<n-1<<endl;
        cout<<"1 "<<n-1<<endl;
        cout<<n-1<<" "<<n<<endl;
        cout<<n-1<<" "<<n<<endl;
        return;
    }
    cout<<2<<endl;
    cout<<"1 "<<n<<endl;
    cout<<"1 "<<n<<endl;
}

int main() {
   sh_fio;
   ll t;
   double kh = 123459;
   float f1,f2,f3;
   bool flag;
   string s,ss;
   cin>>t;
   while(t--)
   {
       ll n,a,b;
       cin>>n;
       vector<ll> arr(n);
       for(ll i=0;i<n;i++)
       {
           cin>>arr[i];
       }
       fu(n,arr);
   }
   return 0;
}
