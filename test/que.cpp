#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> mat( n , vector<int> (n));
        int count = 1;
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = n-1;
        while(count<=n*n){
            for(int i = startCol; i<=endCol; i++){
                mat[startRow][i] = count;
                count++;
            }
            startRow++;
            for(int i = startRow; i<=endRow; i++){
                mat[i][endCol] = count;
                count++;
            }
            endCol--;
            for(int i = endCol; i>=startCol; i--){
                mat[endRow][i] = count;
                count++;
            }
            endRow--;
            for(int i = endRow; i>=startRow; i--){
                mat[i][startCol] = count;
                count++;
            }
            startCol++;
        }
        return mat;  
    
    }
};

int main(){
    Solution obj;
    vector<vector<int>> mat;
    mat = obj.generateMatrix(3);
    for(int i = 0; i<mat.size(); i++){
        for(int j = 0; j<mat[i].size(); i++){
            cout<<mat[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}