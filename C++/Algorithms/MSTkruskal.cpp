//Minimum Spanning Tree
#include "bits/stdc++.h"
using namespace std;

const int N = 1e5+6;
vector<int> parent(N);
vector<int> sz(N);

void makeSet(int v){
    parent[v] = v;
    sz[v] = 1;
}

int findSet(int v){
    if(v==parent[v]){
        return v;
    }
    return parent[v] = findSet(parent[v]);
}

void UnionSet(int a, int b){
    a = findSet(a);
    b = findSet(b);
    if(a != b){
        if(sz[a] < sz[b]){
            swap(a,b);
        }
        parent[b] = a;
        sz[a] += sz[b];
    }
}

int main(){
    for (int i = 0; i < N; i++)
    {
        makeSet(i);
    }
    int n,m;
    cin>>n>>m;
    vector<vector<int>> edges;
    for (int i = 0; i < m; i++)
    {
        int u,v,w;
        cin>>u>>v>>w;
        edges.push_back({u,v,w});
    }
    sort(edges.begin(), edges.end());
    int cost=0;
    cout<<endl;
    cout<<"Edges of mst are "<<endl;
    for(auto i : edges){
        int w = i[0];
        int u = i[1];
        int v = i[2];
        int x = findSet(u);
        int y = findSet(v);
        if(x==y){
            continue;
        }
        else{
            cout<<u<<" - "<<v<<endl;
            cost += w;
            UnionSet(u,v);
        }
    }
    cout<<endl;
    cout<<"WEIGHT OF MST IS  "<<cost;
    return 0;
}
// 8 9
// 1 2 5
// 2 3 6
// 4 3 2
// 1 4 9
// 3 5 5
// 5 6 10
// 6 7 7
// 7 8 1
// 8 5 1


// 2 5 
// 4 9 
// 3 6 
// 3 2 
// 6 10
// 8 1 
// 5 1 
// 28  